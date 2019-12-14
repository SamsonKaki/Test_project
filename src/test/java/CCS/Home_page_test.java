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

	@Test(dataProvider="getdata")
	public void homepage(String username, String password) throws IOException
	{	
	    login_Pageobjects_elements l=new login_Pageobjects_elements(driver);
		l.loginuser().sendKeys(username);
		l.loginpass().sendKeys(password);
		l.loginbutt().click();
		Home_pageobject_elements hp= new Home_pageobject_elements(driver);
		hp.myformsdata().click();
		
		//driver.close();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data= new Object[1][2];
		data [0][0]="dev";
		data[0][1]="Password1";
		//data[1][0]="invalid username";
		//data[1][1]="invalid password";
		return data;
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

	
}

