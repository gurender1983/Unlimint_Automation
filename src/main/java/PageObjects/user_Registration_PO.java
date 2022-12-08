package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utility.PageUtil;

public class user_Registration_PO 
{
	public static WebElement pageName()
	{
		return PageUtil.findBy(By.xpath("//span[text()='Create New Customer Account']"));
		
	}
	
	public static WebElement createAccount()
	{
		//return PageUtil.findBy(By.xpath("//a[contains(text(), 'Create an Account')]/@href"));
		return PageUtil.findBy(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		
	}
	public static WebElement firstName()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"firstname\"]"));
		
	}
	public static WebElement lastName()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"lastname\"]"));
		
	}
	public static WebElement email()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"email_address\"]"));
		
	}
	public static WebElement password()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"password\"]"));
		
	}
	public static WebElement confirmPassword()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"password-confirmation\"]"));
		
	}
	public static WebElement createAccount_button()
	{
		return PageUtil.findBy(By.xpath("//span[text()='Create an Account']"));
		
	}
	
	public static WebElement select_men()
	{
		return PageUtil.findBy(By.xpath("//span[text()='Men']"));
		
	}
	
	public static WebElement select_top()
	{
		//return PageUtil.findBy(By.xpath("//span[text()='Tops']"));
		return PageUtil.findBy(By.xpath("//*[@id=\"ui-id-17\"]"));		
	}
	
	public static WebElement select_jacket()
	{
		//return PageUtil.findBy(By.xpath("//span[text()='Jackets']"));
		return PageUtil.findBy(By.xpath("//*[@id=\"ui-id-19\"]/span"));
		
		
	}
	
	public static WebElement select_jac()
	{
		return PageUtil.findBy(By.xpath("//ol[@class='products list items product-items']/li//img"));
		
	}
	
	public static WebElement select_size()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
		
	}
	public static WebElement select_color()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"option-label-color-93-item-49\"]"));
		
	}
	
	
	
	public static WebElement addtocart()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"product-addtocart-button\"]/span"));
		
	}
	
	public static WebElement item()
	{
		//return PageUtil.findBy(By.xpath("//span[text()='My Cart']"));
		return PageUtil.findBy(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
			
	}
	
	public static WebElement checkout()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
		
	}
	
	public static WebElement street()
	{
		return PageUtil.findBy(By.xpath("//input[@name='street[0]']"));
		
	}
	
	public static WebElement city()
	{
		return PageUtil.findBy(By.xpath("//input[@name='city']"));
		
	}
	
	public static WebElement state()
	{
		return PageUtil.findBy(By.xpath("//select[@name='region_id']"));
		
	}
	public static WebElement zipcode()
	{
		return PageUtil.findBy(By.xpath("//input[@name='postcode']"));
		
	}
	public static WebElement phone()
	{
		return PageUtil.findBy(By.xpath("//input[@name='telephone']"));
		
	}
	public static WebElement shipmethod()
	{
		return PageUtil.findBy(By.xpath("//input[@name='ko_unique_1']"));
		
	}
	public static WebElement next()
	{
		return PageUtil.findBy(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span"));
		
	}
	public static WebElement placeorder()
	{
		return PageUtil.findBy(By.xpath("//button[@title='Place Order']"));
		
	}
	public static WebElement confirm_msg()
	{
		return PageUtil.findBy(By.xpath("//span[@data-ui-id='page-title-wrapper']"));
		
	}
	
	
	

}
