package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search_page_objects {
	
	public WebDriver driver;
	
	
	By search=By.cssSelector("[name*='search_query']");

	By submitsearch=By.cssSelector("[name*='submit_search']");
	
	

	public search_page_objects(WebDriver driver)
	
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement searchitem()
	{
		return driver.findElement(search);
	   }
	
	public WebElement searchbutton()
	{
		return driver.findElement(submitsearch);
	   }


}