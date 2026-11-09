package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {

	private static ExtentReports extent = ExtentManager.createReport();

	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	public static ExtentTest getTest() {
		return extentTest.get();
	}

	public static ExtentTest startTest(String testName, String desc) {

		ExtentTest test = extent.createTest(testName, desc);

		extentTest.set(test);

		return test;
	}

	public static void unload() {
		extentTest.remove();
	}

	public static void flushReport() {
		extent.flush();
		System.out.println("Extent Report generated successfully.");
	}
}
