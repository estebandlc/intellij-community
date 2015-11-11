/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.debugger.breakpoints

import com.intellij.debugger.SourcePosition
import com.intellij.debugger.ui.breakpoints.JavaLineBreakpointType
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.xdebugger.XDebuggerUtil
import com.intellij.xdebugger.XSourcePosition
import com.intellij.xdebugger.impl.XSourcePositionImpl
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils
import org.jetbrains.kotlin.idea.core.refactoring.getLineEndOffset
import org.jetbrains.kotlin.idea.core.refactoring.getLineNumber
import org.jetbrains.kotlin.idea.core.refactoring.getLineStartOffset
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.endOffset
import org.jetbrains.kotlin.psi.psiUtil.startOffset
import java.util.*

fun canPutAt(file: VirtualFile, line: Int, project: Project, breakpointTypeClass: Class<*>): Boolean {
    val psiFile = PsiManager.getInstance(project).findFile(file)

    if (psiFile == null || psiFile.virtualFile.fileType != KotlinFileType.INSTANCE) {
        return false
    }

    val document = FileDocumentManager.getInstance().getDocument(file) ?: return false

    var result: Class<*>? = null
    XDebuggerUtil.getInstance().iterateLine(project, document, line, fun (el: PsiElement): Boolean {
        // avoid comments
        if (el is PsiWhiteSpace || PsiTreeUtil.getParentOfType(el, PsiComment::class.java, false) != null) {
            return true
        }

        var element = el
        var parent = element.parent
        while (parent != null) {
            val offset = parent.textOffset
            if (offset >= 0 && document.getLineNumber(offset) != line) break

            element = parent
            parent = element.parent
        }

        if (element is KtProperty || element is KtParameter) {
            if ((element is KtParameter && element.hasValOrVar()) || (element is KtProperty && !element.isLocal)) {
                result = KotlinFieldBreakpointType::class.java
            }
            else {
                result = KotlinLineBreakpointType::class.java
            }
            return false
        }
        else {
            result = KotlinLineBreakpointType::class.java
        }

        return true
    })

    return result == breakpointTypeClass
}

fun computeVariants(
        project: Project, position: XSourcePosition,
        kotlinBreakpointType: KotlinLineBreakpointType
): List<JavaLineBreakpointType.JavaBreakpointVariant> {
    val file = PsiManager.getInstance(project).findFile(position.file) as? KtFile ?: return emptyList()

    val pos = SourcePosition.createFromLine(file, position.line)
    val lambdas = getLambdasAtLineIfAny(pos)
    if (lambdas.isEmpty()) return emptyList()

    val result = LinkedList<JavaLineBreakpointType.JavaBreakpointVariant>()

    val mainMethod = KotlinLineBreakpointType.getContainingMethod(pos.elementAt)
    if (mainMethod != null) {
        result.add(kotlinBreakpointType.KotlinLineBreakpointVariant(
                XSourcePositionImpl.createByElement(mainMethod),
                CodeInsightUtils.getTopmostElementAtOffset(pos.elementAt, pos.offset) ?: mainMethod))
    }

    lambdas.forEachIndexed { ordinal, lambda ->
        result.add(kotlinBreakpointType.KotlinLambdaBreakpointVariant(
                XSourcePositionImpl.createByElement(lambda.bodyExpression), lambda, ordinal))
    }

    if (result.size > 1) {
        val allBreakpoint = (kotlinBreakpointType as JavaLineBreakpointType).JavaBreakpointVariant(position)
        result.addFirst(allBreakpoint)
    }

    return result
}

fun getLambdasAtLineIfAny(sourcePosition: SourcePosition): List<KtFunction> {
    val file = sourcePosition.file as? KtFile ?: return emptyList()
    val lineNumber = sourcePosition.line
    return getLambdasAtLineIfAny(file, lineNumber)
}

fun getLambdasAtLineIfAny(file: KtFile, line: Int): List<KtFunction> {
    var lineStartOffset = file.getLineStartOffset(line) ?: return emptyList()
    var lineEndOffset = file.getLineEndOffset(line) ?: return emptyList()

    var topMostElement: PsiElement? = null
    var elementAt: PsiElement?
    while (topMostElement !is KtElement && lineStartOffset < lineEndOffset) {
        elementAt = file.findElementAt(lineStartOffset)
        if (elementAt != null) {
            topMostElement = CodeInsightUtils.getTopmostElementAtOffset(elementAt, lineStartOffset)
        }
        lineStartOffset++
    }

    if (topMostElement !is KtElement) return emptyList()

    val start = topMostElement.startOffset
    val end = topMostElement.endOffset

    val allInlineFunctionCalls = CodeInsightUtils.
            findElementsOfClassInRange(file, start, end, KtFunction::class.java)
            .filter { KtPsiUtil.getParentCallIfPresent(it as KtExpression) != null }
            .filterIsInstance<KtFunction>()
            .toSet()

    return allInlineFunctionCalls.filter {
        val statement = (it.bodyExpression as? KtBlockExpression)?.statements?.firstOrNull() ?: it
        statement.getLineNumber() == line && statement.getLineNumber(false) == line
    }
}


