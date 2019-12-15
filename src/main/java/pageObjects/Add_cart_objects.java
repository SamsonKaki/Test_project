package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_cart_objects {
	
	public WebDriver driver;
	
	
	By select_dress=By.cssSelector("[title*='Printed Chiffon Dress']");

	By add_cart=By.cssSelector("button[name='Submit']");
	
	

	public Add_cart_objects(WebDriver driver)
	
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement selectdress()
	{
		return driver.findElement(select_dress);
	   }
	
	public WebElement addcart()
	{
		return driver.findElement(add_cart);
	   }


}