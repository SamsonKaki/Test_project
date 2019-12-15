package CCS;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home_pageobject_elements;
import pageObjects.login_Pageobjects_elements;
import pageObjects.search_page_objects;
import resources.base;

public class Search_bar extends base {
	// public static Logger log =LogManager.getLogger(base.class.getName());
	
    @BeforeTest
	public void starttest() throws IOException
	{
		driver=driverintializer();
		driver.get(prop.getProperty("url"));
		 
	}

	@Test
	public void login() throws IOException
	{
		Home_pageobject_elements hp= new Home_pageobject_elements(driver);
		hp.navigatesigninpage().click();
		
		login_Pageobjects_elements l=new login_Pageobjects_elements(driver);
		
		l.loginuser().sendKeys("samsonkaki1995@gmail.com");
		l.loginpass().sendKeys("Christ@8374");
		l.loginbutt().click();
		
		search_page_objects sb= new search_page_objects(driver);
		sb.searchitem().sendKeys("dresses");
		sb.searchbutton().click();
		
		//l.signout().click();
		
	}
	
	   /*@AfterTest
		public void close()
		{
			driver.close();
		}*/
	
}
