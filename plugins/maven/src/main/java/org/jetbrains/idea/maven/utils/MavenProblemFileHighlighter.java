/*
 * Copyright 2000-2009 JetBrains s.r.o.
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
package org.jetbrains.idea.maven.utils;

import com.intellij.openapi.util.Condition;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.idea.maven.model.MavenConstants;

public final class MavenProblemFileHighlighter implements Condition<VirtualFile> {

  @Override
  public boolean value(final VirtualFile file) {
    String fileName = file.getName();
    if (MavenUtil.isPomFileName(fileName)) {
      return true;
    }

    // MavenDomUtil.isProfilesFile(PsiFile)
    if (fileName.equals(MavenConstants.PROFILES_XML)) {
      return true;
    }

    if (fileName.equals(MavenConstants.SETTINGS_XML)) {
      return true;
    }

    return false;
  }
}
