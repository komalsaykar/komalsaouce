package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{
// mention pre condition
	//Write TestCass with helpof @test Annotation 
	
	@BeforeTest
	public void setUp()
	{
		intilization();
	}
	@Test
	public void validateFunctionality()
	{
		RegisterPage reg=new RegisterPage();
		reg.registerPageFunctionality("komal", "saykar", "2345", "komal@123gmail.com", "pune", "pune", "mh", "334","INDIA", "komal@123gmail.com", "komal123", "komal123");
	}
	
	
	
	
	
	
	
	
	
	
	
}
