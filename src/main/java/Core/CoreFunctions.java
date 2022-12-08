package Core;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BrowserInstance.BrowserHandle;
import Utility.Log;


public class CoreFunctions {
	
	public static void click(WebElement element,String elementName) {
		Log.info("Clicking on "+elementName);
		try {
			element.click();
			Log.info("Pass:Successfully clicked on "+elementName);
		}catch(Exception e) {
			Log.info("Fail:Could not click on "+elementName);
			e.printStackTrace();
		}
	}
	public static void waitTillElementDisplayed(WebElement element,String name) {
		Log.info("Waiting for "+name+ " to display");
		for (int i=0;i<15;i++) {
			try {
				if (element.isDisplayed()==true) {
					Log.info("Pass:"+name+" is displayed");
					break;
				}else {
					Thread.sleep(30000);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public static void setText(WebElement element, Object object) {
		Log.info("Setting text");
		try {
			element.sendKeys((String) object);
			Log.info("Pass:" + object + " is entered");
		} catch (Exception e) {
			Log.info("Fail:Unable to set text: " + object);
			e.printStackTrace();
		}
	}

	public static void clearTextField(WebElement element, String name) {
		Log.info("Clearing " + name + " text field");
		try {
			element.clear();
			Log.info("Pass: Text Field " + name + " has been cleared");
		} catch (Exception e) {
			Log.info("Fail:Could not clear " + name + " text field");
			e.printStackTrace();
		}
	}

	public static String getElementText(WebElement element) {
		Log.info("Getting Element Text");
		String text = "";
		try {
			text = element.getText().trim();
			Log.info("Pass:Text is:" + text);
		} catch (Exception e) {
			Log.info("Could not get text");
			e.printStackTrace();
		}
		return text;
	}

	public static String getAttributeText(WebElement element, String attributeName) {
		Log.info("Getting attribute:" + attributeName + " text");
		String attributeValue = "";
		try {
			attributeValue = element.getAttribute(attributeName).toString().trim();
			Log.info("Attribute " + attributeName + " text is:" + attributeValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attributeValue;
	}

	

	public static String takeScreenshot() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String outputFileLocation = System.getProperty("user.dir") + "\\screenshots\\screen_"
				+ dateFormat.format(new Date()) + ".png";
		try {
			Log.info("taking screenshot ");
			File srcFile = ((TakesScreenshot) BrowserHandle.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(outputFileLocation));
			Log.info("screenshot saved | output file : " + outputFileLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return outputFileLocation;
	}

	public static String takeFailedScreenshot(String scenarioName) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String outputFileLocation = System.getProperty("user.dir") +"\\screenshots\\FailedScreenshots\\scenarioName.png";
		try {
			Log.info("Taking Failed Screenshot ");
			File srcFile = ((TakesScreenshot) BrowserHandle.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(outputFileLocation));
			Log.info("Failed Screenshot saved | output file : " + outputFileLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return outputFileLocation;
	}

	
	/*
	 * public static void slider(WebElement element, int x, int y) throws
	 * InterruptedException {
	 * 
	 * Actions move = new Actions(BrowserHandle.getDriver());
	 * move.moveToElement(element).clickAndHold().moveByOffset(x,
	 * y).release().perform();
	 * 
	 * }
	 */

	public static void setText1(WebElement element, Keys arrowDown) {
		Log.info("Setting text");
		try {
			element.sendKeys(arrowDown);
			Log.info("Pass:" + arrowDown + " is entered");
		} catch (Exception e) {
			Log.info("Fail:Unable to set text: " + arrowDown);
			e.printStackTrace();
		}
	}
	
	public static void selectValue(WebElement element, String value) {
		Log.info("Select value");
		try {
						
			Select state = new Select(element);
			state.selectByVisibleText(value);
			
			} catch (Exception e) {
			//Log.info("Fail:Unable to set text: " + arrowDown);
			e.printStackTrace();
		}
	}



	/*
	 * public static void moveToElement(WebElement element) { Actions move = new
	 * Actions(BrowserHandle.getDriver());
	 * Log.info("Moving to "+element.getText()+" element ");
	 * move.moveToElement(element); move.perform();
	 * Log.info("Pass: Moved to element "+element.getText()); }
	 */


}
