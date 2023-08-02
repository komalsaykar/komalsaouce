package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static  UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class RegisterSucessPage extends BaseClass{
	
	
	@FindBy(xpath="//a[@href='login.php']")
	private static  WebElement link;
	
	public RegisterSucessPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String  Getcurrenturlsucess()
	{
 return geturrentUrl();
	
		
	}

public  void  clickOnSignUpLink()
{
	click(link);
}

	
}
