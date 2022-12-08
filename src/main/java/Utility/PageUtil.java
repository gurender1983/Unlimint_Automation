package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserInstance.BrowserHandle;


public class PageUtil {
	
	public static WebElement findBy(By webLocator) {

			Log.info("finding Web element " + webLocator);
			WebElement temp_android = (WebElement) BrowserHandle.getDriver().findElement(webLocator);
			return temp_android;

	}

	public static List<WebElement> findBys(By webLocator) {	

			Log.info("finding Webelements " + webLocator);
			List<WebElement> temp_android = BrowserHandle.getDriver().findElements(webLocator);
			return temp_android;

		
	}

	public static boolean findByDisplyed(By webLocator) {

			Log.info("finding Web element " + webLocator);
			return BrowserHandle.getDriver().findElement(webLocator) != null;

	}

}
