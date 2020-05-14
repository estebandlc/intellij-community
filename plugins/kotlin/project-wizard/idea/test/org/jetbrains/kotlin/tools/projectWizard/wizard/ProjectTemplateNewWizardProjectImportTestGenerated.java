/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.projectWizard.wizard;

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
@RunWith(JUnit3RunnerWithInners.class)
public class ProjectTemplateNewWizardProjectImportTestGenerated extends AbstractProjectTemplateNewWizardProjectImportTest {
    @TestMetadata("project-wizard/cli/testData/projectTemplatesBuildFileGeneration")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GradleKts extends AbstractProjectTemplateNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestGradleKts, this, testDataFilePath);
        }

        public void testAllFilesPresent() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("project-wizard/cli/testData/projectTemplatesBuildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
        }

        @TestMetadata("backendApplication")
        public void testBackendApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/backendApplication/");
        }

        @TestMetadata("consoleApplication")
        public void testConsoleApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/consoleApplication/");
        }

        @TestMetadata("frontendApplication")
        public void testFrontendApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/frontendApplication/");
        }

        @TestMetadata("fullStackWebApplication")
        public void testFullStackWebApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/fullStackWebApplication/");
        }

        @TestMetadata("multiplatformApplication")
        public void testMultiplatformApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformApplication/");
        }

        @TestMetadata("multiplatformLibrary")
        public void testMultiplatformLibrary() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
        }

        @TestMetadata("multiplatformMobileApplication")
        public void testMultiplatformMobileApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileApplication/");
        }

        @TestMetadata("multiplatformMobileLibrary")
        public void testMultiplatformMobileLibrary() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileLibrary/");
        }

        @TestMetadata("nativeApplication")
        public void testNativeApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/nativeApplication/");
        }
    }

    @TestMetadata("project-wizard/cli/testData/projectTemplatesBuildFileGeneration")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class GradleGroovy extends AbstractProjectTemplateNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestGradleGroovy, this, testDataFilePath);
        }

        public void testAllFilesPresent() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("project-wizard/cli/testData/projectTemplatesBuildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
        }

        @TestMetadata("backendApplication")
        public void testBackendApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/backendApplication/");
        }

        @TestMetadata("consoleApplication")
        public void testConsoleApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/consoleApplication/");
        }

        @TestMetadata("frontendApplication")
        public void testFrontendApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/frontendApplication/");
        }

        @TestMetadata("fullStackWebApplication")
        public void testFullStackWebApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/fullStackWebApplication/");
        }

        @TestMetadata("multiplatformApplication")
        public void testMultiplatformApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformApplication/");
        }

        @TestMetadata("multiplatformLibrary")
        public void testMultiplatformLibrary() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
        }

        @TestMetadata("multiplatformMobileApplication")
        public void testMultiplatformMobileApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileApplication/");
        }

        @TestMetadata("multiplatformMobileLibrary")
        public void testMultiplatformMobileLibrary() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileLibrary/");
        }

        @TestMetadata("nativeApplication")
        public void testNativeApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/nativeApplication/");
        }
    }

    @TestMetadata("project-wizard/cli/testData/projectTemplatesBuildFileGeneration")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Maven extends AbstractProjectTemplateNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestMaven, this, testDataFilePath);
        }

        public void testAllFilesPresent() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("project-wizard/cli/testData/projectTemplatesBuildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
        }

        @TestMetadata("backendApplication")
        public void testBackendApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/backendApplication/");
        }

        @TestMetadata("consoleApplication")
        public void testConsoleApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/consoleApplication/");
        }

        @TestMetadata("frontendApplication")
        public void testFrontendApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/frontendApplication/");
        }

        @TestMetadata("fullStackWebApplication")
        public void testFullStackWebApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/fullStackWebApplication/");
        }

        @TestMetadata("multiplatformApplication")
        public void testMultiplatformApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformApplication/");
        }

        @TestMetadata("multiplatformLibrary")
        public void testMultiplatformLibrary() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
        }

        @TestMetadata("multiplatformMobileApplication")
        public void testMultiplatformMobileApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileApplication/");
        }

        @TestMetadata("multiplatformMobileLibrary")
        public void testMultiplatformMobileLibrary() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileLibrary/");
        }

        @TestMetadata("nativeApplication")
        public void testNativeApplication() throws Exception {
            runTest("project-wizard/cli/testData/projectTemplatesBuildFileGeneration/nativeApplication/");
        }
    }
}
