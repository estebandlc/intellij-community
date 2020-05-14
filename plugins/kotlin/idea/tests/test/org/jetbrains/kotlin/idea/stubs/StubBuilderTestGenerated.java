/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.stubs;

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
@TestMetadata("idea/testData/stubs")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class StubBuilderTestGenerated extends AbstractStubBuilderTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresent() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/stubs"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("AnnotationClass.kt")
    public void testAnnotationClass() throws Exception {
        runTest("idea/testData/stubs/AnnotationClass.kt");
    }

    @TestMetadata("AnnotationOnClass.kt")
    public void testAnnotationOnClass() throws Exception {
        runTest("idea/testData/stubs/AnnotationOnClass.kt");
    }

    @TestMetadata("AnnotationOnFunction.kt")
    public void testAnnotationOnFunction() throws Exception {
        runTest("idea/testData/stubs/AnnotationOnFunction.kt");
    }

    @TestMetadata("AnnotationOnLocalFunction.kt")
    public void testAnnotationOnLocalFunction() throws Exception {
        runTest("idea/testData/stubs/AnnotationOnLocalFunction.kt");
    }

    @TestMetadata("AnnotationValues.kt")
    public void testAnnotationValues() throws Exception {
        runTest("idea/testData/stubs/AnnotationValues.kt");
    }

    @TestMetadata("AnnotationWithValue.kt")
    public void testAnnotationWithValue() throws Exception {
        runTest("idea/testData/stubs/AnnotationWithValue.kt");
    }

    @TestMetadata("AnnotationsOnPrimaryCtr.kt")
    public void testAnnotationsOnPrimaryCtr() throws Exception {
        runTest("idea/testData/stubs/AnnotationsOnPrimaryCtr.kt");
    }

    @TestMetadata("AnonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        runTest("idea/testData/stubs/AnonymousObject.kt");
    }

    @TestMetadata("ClassObject.kt")
    public void testClassObject() throws Exception {
        runTest("idea/testData/stubs/ClassObject.kt");
    }

    @TestMetadata("ClassProperty.kt")
    public void testClassProperty() throws Exception {
        runTest("idea/testData/stubs/ClassProperty.kt");
    }

    @TestMetadata("ClassTypeParameters.kt")
    public void testClassTypeParameters() throws Exception {
        runTest("idea/testData/stubs/ClassTypeParameters.kt");
    }

    @TestMetadata("Const.kt")
    public void testConst() throws Exception {
        runTest("idea/testData/stubs/Const.kt");
    }

    @TestMetadata("Contracts.kt")
    public void testContracts() throws Exception {
        runTest("idea/testData/stubs/Contracts.kt");
    }

    @TestMetadata("DanglingAnnotations.kt")
    public void testDanglingAnnotations() throws Exception {
        runTest("idea/testData/stubs/DanglingAnnotations.kt");
    }

    @TestMetadata("DynamicType.kt")
    public void testDynamicType() throws Exception {
        runTest("idea/testData/stubs/DynamicType.kt");
    }

    @TestMetadata("FilePackage.kt")
    public void testFilePackage() throws Exception {
        runTest("idea/testData/stubs/FilePackage.kt");
    }

    @TestMetadata("FunctionInNotNamedObject.kt")
    public void testFunctionInNotNamedObject() throws Exception {
        runTest("idea/testData/stubs/FunctionInNotNamedObject.kt");
    }

    @TestMetadata("FunctionParameters.kt")
    public void testFunctionParameters() throws Exception {
        runTest("idea/testData/stubs/FunctionParameters.kt");
    }

    @TestMetadata("InnerClass.kt")
    public void testInnerClass() throws Exception {
        runTest("idea/testData/stubs/InnerClass.kt");
    }

    @TestMetadata("LocalClass.kt")
    public void testLocalClass() throws Exception {
        runTest("idea/testData/stubs/LocalClass.kt");
    }

    @TestMetadata("LocalClassInLocalFunction.kt")
    public void testLocalClassInLocalFunction() throws Exception {
        runTest("idea/testData/stubs/LocalClassInLocalFunction.kt");
    }

    @TestMetadata("LocalNamedObject.kt")
    public void testLocalNamedObject() throws Exception {
        runTest("idea/testData/stubs/LocalNamedObject.kt");
    }

    @TestMetadata("ManyAnnotationsOnFunction.kt")
    public void testManyAnnotationsOnFunction() throws Exception {
        runTest("idea/testData/stubs/ManyAnnotationsOnFunction.kt");
    }

    @TestMetadata("MembersInLocalClass.kt")
    public void testMembersInLocalClass() throws Exception {
        runTest("idea/testData/stubs/MembersInLocalClass.kt");
    }

    @TestMetadata("MembersInLocalObject.kt")
    public void testMembersInLocalObject() throws Exception {
        runTest("idea/testData/stubs/MembersInLocalObject.kt");
    }

    @TestMetadata("NamedObject.kt")
    public void testNamedObject() throws Exception {
        runTest("idea/testData/stubs/NamedObject.kt");
    }

    @TestMetadata("NotStorePropertiesFrom.kt")
    public void testNotStorePropertiesFrom() throws Exception {
        runTest("idea/testData/stubs/NotStorePropertiesFrom.kt");
    }

    @TestMetadata("NotStorePropertyFromDelegate.kt")
    public void testNotStorePropertyFromDelegate() throws Exception {
        runTest("idea/testData/stubs/NotStorePropertyFromDelegate.kt");
    }

    @TestMetadata("NotStorePropertyFromInitializer.kt")
    public void testNotStorePropertyFromInitializer() throws Exception {
        runTest("idea/testData/stubs/NotStorePropertyFromInitializer.kt");
    }

    @TestMetadata("ObjectInInitializer.kt")
    public void testObjectInInitializer() throws Exception {
        runTest("idea/testData/stubs/ObjectInInitializer.kt");
    }

    @TestMetadata("ObjectInPropertyDelegate.kt")
    public void testObjectInPropertyDelegate() throws Exception {
        runTest("idea/testData/stubs/ObjectInPropertyDelegate.kt");
    }

    @TestMetadata("PackageProperty.kt")
    public void testPackageProperty() throws Exception {
        runTest("idea/testData/stubs/PackageProperty.kt");
    }

    @TestMetadata("ParametersWithFqName.kt")
    public void testParametersWithFqName() throws Exception {
        runTest("idea/testData/stubs/ParametersWithFqName.kt");
    }

    @TestMetadata("PropertyAsPropertyInitalizerInvalidCode.kt")
    public void testPropertyAsPropertyInitalizerInvalidCode() throws Exception {
        runTest("idea/testData/stubs/PropertyAsPropertyInitalizerInvalidCode.kt");
    }

    @TestMetadata("QualifiedAnnotationOnFunction.kt")
    public void testQualifiedAnnotationOnFunction() throws Exception {
        runTest("idea/testData/stubs/QualifiedAnnotationOnFunction.kt");
    }

    @TestMetadata("SecondaryConstructors.kt")
    public void testSecondaryConstructors() throws Exception {
        runTest("idea/testData/stubs/SecondaryConstructors.kt");
    }

    @TestMetadata("SimpleEnumBuild.kt")
    public void testSimpleEnumBuild() throws Exception {
        runTest("idea/testData/stubs/SimpleEnumBuild.kt");
    }

    @TestMetadata("StarProjection.kt")
    public void testStarProjection() throws Exception {
        runTest("idea/testData/stubs/StarProjection.kt");
    }

    @TestMetadata("TypeAnnotation.kt")
    public void testTypeAnnotation() throws Exception {
        runTest("idea/testData/stubs/TypeAnnotation.kt");
    }
}
