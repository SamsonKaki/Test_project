package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_pageobject_elements {
	
	public WebDriver driver;
	
	
	By myforms=By.cssSelector("[id*='myforms']");
	
	
	public Home_pageobject_elements(WebDriver driver)
	
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement myformsdata()
	{
		return driver.findElement(myforms);
	   }

}