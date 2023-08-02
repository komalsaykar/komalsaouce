package PageLayer;

import static UtilsLayer.HandleDropDown.selectByVisibleText;
import static UtilsLayer.UtilsClass.click;
import static UtilsLayer.UtilsClass.sendKeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	static String UserName = null;
	static String PassWord = null;
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="userName")
	private WebElement email;
	
	
	@FindBy(name="address1")
	private WebElement address;
	
	
	@FindBy(name="city")
	private WebElement city;
	
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="postalCode")
	private WebElement postalcode;
	
	
	
	@FindBy(name="country")
	private WebElement country;
	
	
	@FindBy(name="email")
	static WebElement username;
	
	
	
	@FindBy(name="password")
	private WebElement password;
	
	
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	

	@FindBy(name="submit")
	private WebElement submit;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerPageFunctionality(String fname,String lname,String phoneno,String EmailId,
			String Address,String City,String State,String code,String Country,String UserName,String pass,String ConfPass)
	{
		sendKeys(firstname,fname);
		sendKeys(lastname, lname);
		sendKeys(phone, phoneno);
		sendKeys(email, EmailId);
		sendKeys(address, Address);
		sendKeys(city, City);
		sendKeys(state, State);
		sendKeys(postalcode, code);
		selectByVisibleText(country, Country);
		
		sendKeys(username, UserName);
		sendKeys(password, pass);
		sendKeys(confirmPassword, ConfPass);
		click(submit);
		
	}
	
	
	
	
	
	
	
	
	

}
