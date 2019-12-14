package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver driverintializer() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Samson\\gitstuff\\src\\main\\java\\resources\\ccsdata.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Selenium jars\\chromedriver.exe" );
			driver=new ChromeDriver();
			
		}
		
		else if (browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\Selenium jars\\geckodriver.exe" );
		    driver= new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
/*	public void getscreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Failed\\"+result+"Screenshot.png"));
	}*/

}
