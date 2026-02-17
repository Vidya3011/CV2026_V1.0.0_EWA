package Computhink.Generic;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getExtent() {
		if (extent == null) {

			String timeStamp = new SimpleDateFormat("MMM_dd_yyyy_hh_mm_a").format(new Date());
			String path = System.getProperty("user.dir") + "/reports/ExtentReport_" + timeStamp + ".html";

			ExtentSparkReporter reporter = new ExtentSparkReporter(path);

			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("Selenium TestNG Report");

			extent = new ExtentReports();
			extent.attachReporter(reporter);

			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Tester", "Dipak");
			extent.setSystemInfo("Framework", "Selenium + TestNG");
		}
		return extent;
	}
}
