package com.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports addReport() {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter ("extentReport.html");
		ExtentReports Report = new ExtentReports();
		Report.attachReporter(htmlReport);
		Report.setSystemInfo("TesterName", "Nikita");
		Report.setSystemInfo("Environment", "SIT");
		Report.setSystemInfo("Testing", "Regression");
		return Report;
	}	
	}

