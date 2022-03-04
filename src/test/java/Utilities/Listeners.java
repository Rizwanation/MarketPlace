package Utilities;

import base.baseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends baseClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("Executing Test: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Successfully executed: " + result.getName());
        GetScreenShot("Success_" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Execution Failed for: " +result.getName());
        GetScreenShot("Failure_" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
