package com.home.faketests;

import com.home.faketests.utils.TestResult;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

/**
 * Created by Oleksandr_Danchenko on 21.09.2016.
 */
public class Base {

    protected ThreadLocal<TestResult> currentTest = new ThreadLocal<>();

    @BeforeMethod
    public void defore(Method testContext) {
        System.out.print("Started " +  testContext.getName() + "\n");
        TestResult result = new TestResult();
        result.setTestName(testContext.getName());
        result.setDescription("Description for: " + testContext.getName());
        currentTest.set(result);
    }

    @AfterMethod
    public void after(ITestResult result) {
        if (result.isSuccess()) {
            currentTest.get().setResult("SUCCESS");
        } else {
            currentTest.get().setResult("FAILURE");
        }
        System.out.print(currentTest.get().getTestName() + " finished  " +  currentTest.get().getResult() + " " + currentTest.get().getDescription() + "\n");
    }

}
