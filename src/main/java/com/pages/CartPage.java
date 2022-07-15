package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	public WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}

		By ChoosedeliveryMethod = By.xpath("//span[text()='Store Pickup']");	
		By Click_on_continue = By.xpath("//button[text()='Continue']");
		By enter_promo_code = By.xpath("//input[@placeholder='Enter Promo code']");
		By click_on_changestore=By.xpath("//a[@class='change-loc dropdown-toggle']");
		//By click_apply = By.xpath("//button[text()=\"Apply\"]");
		By Addcart = By.id("add-cart-btn");
		By Updatequantity = By.name("form-0-quantity");
		
		
 
		
		public WebElement user_ChoosedeliveryMethod()
		{
			return driver.findElement(ChoosedeliveryMethod);
		}
		public WebElement Click_on_continue()
		{
			return driver.findElement(Click_on_continue);
		}
		public WebElement click_on_changestore()
		{
			return driver.findElement(click_on_changestore);
		}
		public WebElement enter_promo_code()
		{
			return driver.findElement(enter_promo_code);
		}
		public WebElement addcart_On()
		{
			return driver.findElement(Addcart);
		}
		public WebElement userclear_Updatequantity()
		{
			return driver.findElement(Updatequantity);
		}
		public WebElement userenter_Updatequantity()
		{
			return driver.findElement(Updatequantity);
		}
		
	}


