package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_Pageobjects_elements {
	
	public WebDriver driver;
	
	
	By username=By.cssSelector("input[id='email']");
	By password=By.cssSelector("input[id*='passwd']");
	By submit = By.cssSelector("button[id*='SubmitLogin']");
	//By signout = By.cssSelector("a[title*='Log me out']");
	
	public login_Pageobjects_elements(WebDriver driver)
	
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public WebElement loginuser()
	{
		return driver.findElement(username);
	   }
    public WebElement loginpass()
    {
    return driver.findElement(password);
      }
  public WebElement loginbutt()
    {
    	return driver.findElement(submit);
    }
  /*  public WebElement signout()
    {
    	return driver.findElement(signout);
    }*/


}