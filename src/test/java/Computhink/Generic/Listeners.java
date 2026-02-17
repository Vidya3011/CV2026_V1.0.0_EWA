package Computhink.Generic;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class Listeners extends BaseClass implements ITestListener {

   public static ExtentReports extent = ExtentManager.getExtent();
   public static  ExtentTest test;
   public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestFailure(ITestResult result) {

        // 🔴 IMPORTANT: Skip logging if this failure is for a retry attempt
        Object retry = result.getAttribute("retry");
        if (retry != null && (boolean) retry) {
            return; // ⛔ do nothing for retry failures
        }

        String testName = result.getMethod().getMethodName();

        // 1️⃣ Capture Screenshot (FINAL FAILURE ONLY)
        String screenshotPath = takeScreenshot(testName);
        log("Test Case failed and Failed Step Screen shots attached in this Test Class");

        // 2️⃣ Attach to Extent Report
        extentTest.get().fail(result.getThrowable());
        extentTest.get().addScreenCaptureFromPath(screenshotPath, testName);

        // 3️⃣ Log in TestNG Report (emailable-report.html)
        Reporter.log(
            "<br><b>Screenshot:</b><br>"
            + "<a href='" + screenshotPath + "' target='_blank'>"
            + "<img src='" + screenshotPath + "' height='250' width='250'/>"
            + "</a><br>"
        );
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().pass("Test Passed sucessfully");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
