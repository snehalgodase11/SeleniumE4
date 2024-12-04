package com.crm.Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.BaseClassDWS;

public class DWSExtentReport 
extends BaseClassDWS implements ITestListener {
  public static  ExtentSparkReporter spark;
  public static ExtentReports report;
  public static ExtentTest test ;
  
  
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestSuccess");
		test.log(Status.PASS, name+"is sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
	test.log(Status.INFO, "onTestFail");
	test.log(Status.FAIL, name+"is Fail");
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	String from = ts.getScreenshotAs(OutputType.BASE64);
//	test.addScreenCaptureFromBase64String(from);
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestSkip");
		test.log(Status.SKIP, name+"is SKIP");
	}

	@Override
	public void onStart(ITestContext context) {
		//create spark
		spark=new ExtentSparkReporter(".\\src\\main\\resources\\TestCase1.html");
		spark.config().setDocumentTitle("Honda kavasaki royal");
		spark.config().setReportName("snehal");
		spark.config().setTheme(Theme.DARK);
		//create extent report
		report=new ExtentReports();
		report.setSystemInfo("os", "linux");
		report.setSystemInfo("browser", "chrome-101");
		//arttach spark
		report.attachReporter(spark);
		//
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	

}
