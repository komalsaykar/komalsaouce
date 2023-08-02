package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	 //Upcasting 
	//Maximize Window
	//implicitly Wait
	//pageOut
	//delete All Cookies
	//get UrL
	public  static  WebDriver driver;
	
	public static void intilization()
	{
	 driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().deleteAllCookies();
		
	}
	
	
	
	

}
