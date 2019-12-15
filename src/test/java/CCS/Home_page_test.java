package CCS;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Home_pageobject_elements;
import pageObjects.login_Pageobjects_elements;
import resources.base;

public class Home_page_test extends base {
	
	 @BeforeTest
		public void starttest() throws IOException
		{
			driver=driverintializer();
			driver.get(prop.getProperty("url"));
		}

	@Test
	public void homepage(String username, String password) throws IOException
	{	
		Home_pageobject_elements hp= new Home_pageobject_elements(driver);
	    hp.navigatesigninpage().click();
		
	}
	/*@AfterTest
	public void close()
	{
		driver.close();
	}*/

	
}

