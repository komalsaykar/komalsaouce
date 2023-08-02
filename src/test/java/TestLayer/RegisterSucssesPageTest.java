package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterSucessPage;

public class RegisterSucssesPageTest extends BaseClass{
	 RegisterSucessPage reg;
	
	@Test(priority=1)
	public void captureurlfunctionality()
	{
	 reg=new RegisterSucessPage();
		String actualurl=reg.Getcurrenturlsucess();
	Assert.assertEquals(actualurl.contains("register_sucess"),true);
	
	}
	
	@Test(priority = 2)
	public void clickOntheSignUpLinkInSuccessPage() {
		 reg=new RegisterSucessPage();
		reg.clickOnSignUpLink();
	}

}
