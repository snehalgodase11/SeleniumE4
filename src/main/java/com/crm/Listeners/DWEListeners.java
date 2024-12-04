package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DWEListeners implements ITestListener {
	 
	@Override
	public void onTestStart(ITestResult result) {
    String name=  result.getMethod().getMethodName();
	Reporter .log("onTestStart:"+name,true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	String name=  result.getMethod().getMethodName();
		Reporter .log("onTestSuccess:"+name,true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=  result.getMethod().getMethodName();
		Reporter .log("onTestFailure:"+name,true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=  result.getMethod().getMethodName();
		Reporter .log("onTestSkipped:"+name,true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String name=  result.getMethod().getMethodName();
		Reporter.log("onTestStart:"+name,true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String name= result.getMethod().getMethodName();
		Reporter .log("onTestFailedWithTimeout:"+name,true);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter .log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter .log("onFinish",true);
	}

	
	

}
