package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import report.ExtentTestManager;

public class ListnersImpl extends Helper implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		ExtentTest test = ExtentTestManager.startTest(result.getMethod().getMethodName(),
				result.getMethod().getDescription());

		test.log(Status.INFO, "Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		ExtentReportManagerLog(Status.PASS, "Test Passed: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		ExtentReportManagerLog(Status.FAIL, "Test Failed: " + result.getName());

		ExtentTest test = ExtentTestManager.getTest();

		if (test != null && result.getThrowable() != null) {
			test.fail(result.getThrowable());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		ExtentReportManagerLog(Status.SKIP, "Test Skipped: " + result.getName());
	}

	private void ExtentReportManagerLog(Status status, String message) {

		ExtentTest test = ExtentTestManager.getTest();

		if (test != null) {
			test.log(status, message);
		}
	}

	@Override
	public void onFinish(ITestContext context) {

		ExtentTestManager.flushReport();
		ExtentTestManager.unload();
	}

}
