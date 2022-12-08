package Core;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utility.Log;


public class Assertions
{
	
	public static void isElementDisplayed(WebElement element,String name) {
		Log.info("Verifying Is Element Displayed:"+name);
		boolean status=element.isDisplayed();
		if (status==true) {
			Log.info("Pass:"+name+" is displayed");
		}else{
			Log.info("Fail:"+name+" is NOT displayed");
			Assert.fail();
		}
	}
	
	public static void isElementChecked(WebElement element,String name) {
		Log.info("Verifying Is Element Checked:"+name);
		boolean status=element.isSelected();
		if (status==true) {
			Log.info("Pass:"+name+" is checked");
		}else{
			Log.info("Fail:"+name+" is NOT checked");
			Assert.fail();
		}
	}
	
	public static void verifyText(String actText,String expText) {
		Log.info("Verifying Text");
		if (actText.equals(expText)) {
			Log.info("Pass: Act Text:"+actText+" Exp Text:"+expText);
		}else {
			Log.info("Fail: Act Text:"+actText+" Exp Text:"+expText);
			Assert.fail();
		}
	}
	
	public static void verifyIntegerValuesAreSame(int actInt,int expInt){
		Log.info("Verifying two integer values");
		if (actInt==expInt){
			Log.info("Pass:Act int:"+actInt+" is equal to Exp int:"+expInt);
		}else{
			Log.info("Fail:Act int:"+actInt+" is not equal to Exp int:"+expInt);
			Assert.fail();
		}
	}
	
	public static void verifyIntegerValuesAreNOTSame(int actInt,int expInt){
		Log.info("Verifying two integer values are NOT same");
		if (actInt!=expInt){
			Log.info("Pass:Act int:"+actInt+" is NOT equal to Exp int:"+expInt);
		}else{
			Log.info("Fail:Act int:"+actInt+" is equal to Exp int:"+expInt);
			Assert.fail();
		}
	}
	
	public static void verifyDoubleValues(double actDouble,double expDouble){
		Log.info("Verifying two double values are same");
		if (actDouble==expDouble){
			Log.info("Pass:Act double:"+actDouble+" is equal to Exp double:"+expDouble);
		}else{
			Log.info("Fail:Act double:"+actDouble+" is not equal to Exp double:"+expDouble);
			Assert.fail();
		}
	}
	
	public static void verifyDoubleValuesAreNOTSame(double actDouble,double expDouble){
		Log.info("Verifying two double values are NOT same");
		if (actDouble!=expDouble){
			Log.info("Pass:Act double:"+actDouble+" is NOT equal to Exp double:"+expDouble);
		}else{
			Log.info("Fail:Act double:"+actDouble+" is equal to Exp double:"+expDouble);
			Assert.fail();
		}
	}
	
	public static void verifyChildStringInParentString(String parentString,String childString) {
		Log.info("Verifying whether child text is present in parent text");
		if (parentString.contains(childString)) {
			Log.info("Pass:child:"+childString+"Parent:"+parentString);
		}else {
			Log.info("Fail:child:"+childString+" parent:"+parentString);
			Assert.fail();
		}
	}
	
	public static void verify_ChildString_Not_In_ParentString(String parentString,String childString) {
		Log.info("Verifying child text is NOT present in parent text");
		if (!parentString.contains(childString)) {
			Log.info("Pass:child:"+childString+" is NOT present in Parent:"+parentString);
		}else {
			Log.info("Fail:child:"+childString+" is present in parent:"+parentString);
			Assert.fail();
		}
	}
	
	public static void verifyValue(int actInt, int expInt) {
		Log.info("Verifying two integer values");
		if (actInt == expInt) {
			Log.info("Pass:Act int: " + actInt + " is equal to Exp int: " + expInt);
		} else {
			Log.info("Fail:Act int: " + actInt + " is not equal to Exp int: " + expInt);
			Assert.fail();
		}
	}

	public static void verifyValue(Boolean value, String desc) {
		Log.info("Verifying boolean values");
		if (value) {
			Log.info("Pass: desc:" + desc + " and found value as " + value);
		} else {
			Log.info("Fail: desc:" + desc + " but found value as " + value);
			Assert.fail();
		}
	}

	public static void verifyValue(Boolean actBoolean, Boolean expBoolean, String desc) {
		Log.info("Verifying boolean values");
		if (actBoolean==expBoolean) {
			Log.info("Pass: desc:" + desc + " and found value as " + expBoolean);
		} else {
			Log.info("Fail: desc:" + desc + " but found value as " + expBoolean);
			Assert.fail();
		}
	}

	public static void verifyValue(double actDouble, double expDouble) {
		Log.info("Verifying two double values");
		if (actDouble == expDouble) {
			Log.info("Pass:Act double:" + actDouble + " is equal to Exp double:" + expDouble);
		} else {
			Log.info("Fail:Act double:" + actDouble + " is not equal to Exp double:" + expDouble);
			Assert.fail();
		}
	}

	public static void verifyValue(String actString, String expString) {
		Log.info("Verifying String values");
		if (actString.equalsIgnoreCase(expString)) {
			Log.info("Pass:child:" + expString + "Parent:" + actString);
		} else {
			Log.info("Fail:child:" + expString + " parent:" + actString);
			Assert.fail();
		}
	}
	
	public static void isElementEnabled(WebElement element, String name) {
		Log.info("Verifying Is Element Enabled : " + name);
		if (element.isEnabled()==true) {
			Log.info("Pass:" + name + " is enabled");
		} else {
			Log.info("Fail:" + name + " is NOT enabled");
			Assert.fail();
		}

	}
	
	public static int ifListDataDiffisSame(List<Integer> li) {

		int diff = 0;
		int temp = 0;
		for (int i = 0; i < li.size(); i++) {

			if (i == (li.size() - 1))
				break;

			temp = li.get(i + 1) - li.get(i);

			if (i == 0)
				diff = temp;
			else if (diff != temp)
				Assert.fail("data is not incremental in list");

		}
		return diff;
	}

}
