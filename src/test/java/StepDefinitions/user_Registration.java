package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BrowserInstance.BrowserHandle;
import Core.CoreFunctions;
import Cucumber.TestContext;
import PageObjects.user_Registration_PO;
import cucumber.api.java.en.*;
import enums.Context;

public class user_Registration {
	
	TestContext testContext = TestContext.GetInstance();
	Actions action = new Actions(BrowserHandle.getDriver());
	
	
	@Given("^Open the url \"([^\"]*)\"$")
	public void open_the_url(String url) 
	{
	    BrowserHandle.getDriver().get(url);
	}

	@When("^User click on create an account link$")
	public void user_click_on_create_an_account_link()
	{
	   //CoreFunctions.click(user_Registration_PO.createAccount(), "Click on create account link");
		CoreFunctions.click(user_Registration_PO.createAccount(), "Click on create account link");
	}

	@Then("^Verify user registration page open$")
	public void verify_user_registration_page_open()
	{
	    CoreFunctions.getElementText(user_Registration_PO.pageName());
	    assertEquals(CoreFunctions.getElementText(user_Registration_PO.pageName()), "Create New Customer Account");
	}

	@Then("^User enter details \"([^\"]*)\"$")
	public void user_enter_details(String password)
	{ 
	  
	  CoreFunctions.setText(user_Registration_PO.firstName(), (String)testContext.getScenarioContext().getContext(Context.firstName));
	  CoreFunctions.setText(user_Registration_PO.lastName(), (String)testContext.getScenarioContext().getContext(Context.lastName));
	  CoreFunctions.setText(user_Registration_PO.email(), (String)testContext.getScenarioContext().getContext(Context.email));
	  CoreFunctions.setText(user_Registration_PO.password(), password);
	  CoreFunctions.setText(user_Registration_PO.confirmPassword(), password);
	}

	
	@Then("^Click on create an account button$")
	public void click_on_create_an_account_button()
	{
	   CoreFunctions.click(user_Registration_PO.createAccount_button(), "Click on create account button");
	}

	@Then("^User select jackets for men$") 
	public void user_select_jackets_for_men(){
		
		
		
		WebElement main_menu = user_Registration_PO.select_men();
		action.moveToElement(main_menu).perform();
		
		WebElement sub_menu = user_Registration_PO.select_top();
		action.moveToElement(sub_menu).perform();
		
		WebElement sub_menus = user_Registration_PO.select_jacket();
		CoreFunctions.waitTillElementDisplayed(sub_menu, "wait");
		sub_menus.click();
	  
	}

	@Then("^User choose the jacket$")
	public void user_choose_the_jacket(){
		
		CoreFunctions.click(user_Registration_PO.select_jac(), "select an item");
	    
	}
	
	@Then("^User click on add to cart button$")
	public void user_click_on_add_to_cart_button(){
		CoreFunctions.click(user_Registration_PO.select_color(), "choose the color");
		CoreFunctions.click(user_Registration_PO.select_size(), "choose the size");
		CoreFunctions.click(user_Registration_PO.addtocart(), "add to cart");
	   
	}
	
	@Then("^User click on proceed to check out button$")
	public void user_click_on_proceed_to_check_out_button(){
		
		CoreFunctions.waitTillElementDisplayed(user_Registration_PO.item(), "element");
		action.sendKeys(Keys.PAGE_UP).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CoreFunctions.waitTillElementDisplayed(user_Registration_PO.item(), "wait for element");
		CoreFunctions.click(user_Registration_PO.item(), "");
		CoreFunctions.click(user_Registration_PO.checkout(), "checkout");
	   
	}
	
	@Then("^Enter street addres$")
	public void enter_street_address(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		CoreFunctions.setText(user_Registration_PO.street(), (String)testContext.getScenarioContext().getContext(Context.address));
	   
	}
	
	@Then("^Enter city$")
	public void enter_city(){
		CoreFunctions.setText(user_Registration_PO.city(), (String)testContext.getScenarioContext().getContext(Context.city));
	    
	}
	
	@Then("^Select state$")
	public void select_state()
	{
		
		CoreFunctions.selectValue(user_Registration_PO.state(), (String)testContext.getScenarioContext().getContext(Context.state));
	    
	}
	
	@Then("^Enter Zip code$")
	public void enter_zip_code()
	{
	   CoreFunctions.setText(user_Registration_PO.zipcode(), (String)testContext.getScenarioContext().getContext(Context.postcode));
	   
	}
	
	@Then("^Enter Phone number$")
	public void enter_phone_number()
	{
	    CoreFunctions.setText(user_Registration_PO.phone(), (String)testContext.getScenarioContext().getContext(Context.phone));
	}
	
	@Then("^Select shipping method$")
	public void select_shipping_method()
	{
	  CoreFunctions.click(user_Registration_PO.shipmethod(), "shipping method");
	}
	
	@Then("^Click on next button$")
	public void click_on_next_button(){
		
		CoreFunctions.click(user_Registration_PO.next(), "next button");
	   
	}
	
	@Then("^Click on place order button$")
	public void click_on_place_ordr_button(){
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		CoreFunctions.click(user_Registration_PO.placeorder(), "place order button");
	   
	}
	
	@Then("^Extract the order number$")
	public void extract_the_order_number()
	{
	    CoreFunctions.getElementText(user_Registration_PO.confirm_msg());
	}
		
	


}
