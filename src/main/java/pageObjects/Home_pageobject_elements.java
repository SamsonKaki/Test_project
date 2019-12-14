package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_pageobject_elements {
	
	public WebDriver driver;
	
	
	By signinbutton=By.cssSelector("a[href*='my-account']");
	
	
	public Home_pageobject_elements(WebDriver driver)
	
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement navigatesigninpage()
	{
		return driver.findElement(signinbutton);
	   }

}