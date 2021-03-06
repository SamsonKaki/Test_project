package CCS;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Home_pageobject_elements;
import pageObjects.login_Pageobjects_elements;
import resources.base;

public class login_page_test_using_dataprovider_annotation extends base {
	// public static Logger log =LogManager.getLogger(base.class.getName());
	
	  @BeforeTest
		public void starttest() throws IOException
		{
			driver=driverintializer();
			driver.get(prop.getProperty("url"));
		/*	log.info("Navigated to Home page");
			 log.debug("Navigated to Home page");
			 log.error("Navigated to Home page");
			 log.fatal("Navigated to Home page");*/
		}


	@Test(dataProvider="getdata")
	public void login_multiple_data(String username, String password) throws IOException
	{	
		Home_pageobject_elements hp= new Home_pageobject_elements(driver);
		hp.navigatesigninpage().click();
		
	 login_Pageobjects_elements l=new login_Pageobjects_elements(driver);
		l.loginuser().sendKeys(username);
		l.loginpass().sendKeys(password);
		l.loginbutt().click();
		//l.signout().click();
		//driver.close();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data= new Object[1][2];
		data [0][0]="samsonkaki1995@gmail.com";
		data[0][1]="Christ@8374";
		//data[1][0]="invalid username";
		//data[1][1]="invalid password";
		return data;


	/*@AfterTest
	public void close()
	{
		driver.close();
	}*/
	      }
	  }
