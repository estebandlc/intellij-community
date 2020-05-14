/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.filters;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestMetadata("idea/testData/debugger/exceptionFilter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinExceptionFilterTestGenerated extends AbstractKotlinExceptionFilterTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresent() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/debugger/exceptionFilter"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("breakpointReachedAt")
    public void testBreakpointReachedAt() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/breakpointReachedAt/");
    }

    @TestMetadata("inlineFunCallInLibrary")
    public void testInlineFunCallInLibrary() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunCallInLibrary/");
    }

    @TestMetadata("inlineFunCallSite")
    public void testInlineFunCallSite() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunCallSite/");
    }

    @TestMetadata("inlineFunCallSiteInInlineLambda")
    public void testInlineFunCallSiteInInlineLambda() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunCallSiteInInlineLambda/");
    }

    @TestMetadata("inlineFunFromLibrary")
    public void testInlineFunFromLibrary() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunFromLibrary/");
    }

    @TestMetadata("inlineFunInnerClassFromLibrary")
    public void testInlineFunInnerClassFromLibrary() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunInnerClassFromLibrary/");
    }

    @TestMetadata("inlineFunctionAnotherFile")
    public void testInlineFunctionAnotherFile() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunctionAnotherFile/");
    }

    @TestMetadata("inlineFunctionAnotherFileWithSmapApplied")
    public void testInlineFunctionAnotherFileWithSmapApplied() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunctionAnotherFileWithSmapApplied/");
    }

    @TestMetadata("inlineFunctionInnerClass")
    public void testInlineFunctionInnerClass() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunctionInnerClass/");
    }

    @TestMetadata("inlineFunctionObjectLiteral")
    public void testInlineFunctionObjectLiteral() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunctionObjectLiteral/");
    }

    @TestMetadata("inlineFunctionSameFile")
    public void testInlineFunctionSameFile() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/inlineFunctionSameFile/");
    }

    @TestMetadata("kotlinClass")
    public void testKotlinClass() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/kotlinClass/");
    }

    @TestMetadata("kt2489")
    public void testKt2489() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/kt2489/");
    }

    @TestMetadata("kt2489_2")
    public void testKt2489_2() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/kt2489_2/");
    }

    @TestMetadata("librarySources1")
    public void testLibrarySources1() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/librarySources1/");
    }

    @TestMetadata("librarySources2")
    public void testLibrarySources2() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/librarySources2/");
    }

    @TestMetadata("librarySources3")
    public void testLibrarySources3() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/librarySources3/");
    }

    @TestMetadata("librarySources4")
    public void testLibrarySources4() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/librarySources4/");
    }

    @TestMetadata("multiSamePackage")
    public void testMultiSamePackage() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/multiSamePackage/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("idea/testData/debugger/exceptionFilter/simple/");
    }
}
