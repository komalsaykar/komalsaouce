
package UtilsLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class ListnersClass extends BaseClass implements ITestListener{

	ExtentReports extentreport;
ExtentTest extentTest;
	@Override
	public void onStart(ITestContext context) {
		
		extentreport=ExtentReportSetUp.setUp(context.getSuite().getName());
		
		
		
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		extentTest=extentreport.createTest("Suit is Start" +result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		extentTest.log(Status.PASS, "Test Case is pass "+result.getMethod().getMethodName());
		try {
			extentTest.addScreenCaptureFromPath(ExtentReportSetUp.takesScreenshot("passScreenShot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test Case is pass "+result.getMethod().getMethodName());
		try {
			extentTest.addScreenCaptureFromPath(ExtentReportSetUp.takesScreenshot("FailScreenShot", result.getMethod().getMethodName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test is Skip " +result.getMethod().getMethodName());
	}



	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suit is finish" +context.getSuite().getName());
		extentreport.flush();
	}
	
	//implement ITestListners Class with ExtentReport

	
	
}
