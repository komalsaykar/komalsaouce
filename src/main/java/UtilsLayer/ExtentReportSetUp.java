package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportSetUp extends BaseClass{

	// setup the extend Report properties 
	// get the current date and time
	// capture the screenshot and store in desired loaction
	
	private static final String FileUtils = null;

	public static ExtentReports setUp(String reportName)
	{
		String path = System.getProperty("user.dir")+"//ExtentReports//"+reportName+date()+".html";
		ExtentSparkReporter extentsparkreporter = new ExtentSparkReporter(path);
		ExtentReports extentreports = new ExtentReports();
		extentreports.attachReporter(extentsparkreporter);
		return extentreports;
	}
	
	public static String date()
	{
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	
	public static String takesScreenshot(String folderName, String screenShotName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"//"+folderName+"//"+screenShotName+date()+".png";
		FileUtils.copyFile(src, new File(path));
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
}

























