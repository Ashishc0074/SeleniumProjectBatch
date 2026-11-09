
package report;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static synchronized ExtentReports createReport() {

		if (extent == null) {

			String reportPath = System.getProperty("user.dir") + File.separator + "target" + File.separator
					+ "ExtentReport" + File.separator + "ExtentReport.html";

			File reportFile = new File(reportPath);

			// Create report directory if it does not exist
			File reportDirectory = reportFile.getParentFile();

			if (!reportDirectory.exists()) {
				reportDirectory.mkdirs();
			}

			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

			spark.config().setReportName("AdminLTE Automation Report");
			spark.config().setDocumentTitle("Automation Test Results");

			extent = new ExtentReports();

			extent.attachReporter(spark);

			extent.setSystemInfo("Tester", "Ashish");
			extent.setSystemInfo("Project", "Selenium Automation");
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("Environment", "QA");

			System.out.println("Report path: " + reportPath);
		}

		return extent;
	}
}
