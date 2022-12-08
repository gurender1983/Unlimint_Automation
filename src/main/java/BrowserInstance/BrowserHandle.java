package BrowserInstance;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.esotericsoftware.minlog.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandle
{
	private static WebDriver driver;
	private static File app;
	
	private static WebDriver settingBrowser()
	{
		if(System.getProperty("platformName").equalsIgnoreCase("chrome"))
		{
			Log.info("Starting Chrome Driver");
			WebDriverManager.chromedriver().setup();
			/*
			 * ChromeOptions chromeOptions = new ChromeOptions();
			 * 
			 * //add the headless argument chromeOptions.addArguments("--headless");
			 * chromeOptions.addArguments("--disable-gpu");
			 * chromeOptions.addArguments("--disable-extensions");
			 * chromeOptions.addArguments("--no-sandbox");
			 * chromeOptions.addArguments("--disable-dev-shm-usage");
			 * chromeOptions.addArguments("--headless");
			 * chromeOptions.addArguments("--window-size=1580,1280");
			 */
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}
		else
		{
			Log.info("Starting Firefox Driver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		if(driver == null)
		{
			return settingBrowser();
		}else 
		return driver;
	}
	
	public static void quitDriver()
	{
		Log.info("quitting session");
		driver.quit();
		driver = null;
	}


}
