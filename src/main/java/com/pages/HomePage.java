package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	By signin=By.linkText("SIGN IN");
	
	

	public WebElement clicksignin()
	{
		return driver.findElement(signin);
	}
		
	
	
	
}
