package Utilities;

import base.baseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends baseClass implements ITestListener {


    public static ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());
        System.out.println("Executing Test: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Successfully executed: " + result.getName());
        test.addScreenCaptureFromPath(GetScreenShot("Success_" + result.getName()));
        test.log(Status.PASS,"test passed!");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Execution Failed for: " +result.getName());
        test.addScreenCaptureFromPath(GetScreenShot("Failure_" + result.getName()));
        test.log(Status.FAIL,"Failed!");

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

        extent.flush();
    }
}
