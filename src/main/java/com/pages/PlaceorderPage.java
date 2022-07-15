package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceorderPage {
public WebDriver driver;
	
	public PlaceorderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By ProdceedDdonation = By.xpath("//*[@id=\"add-cart-btn\"]");
	By Donatenow = By.id("donate_now");
	//driver.findElement(By.id("donate_now")).click();
	By ClosethePopup = By.xpath("//button[@class='close']//span[1]");
	By Click_on_continue = By.xpath("//button[text()='Continue']");

	public WebElement user_ProdceedDdonation()
	{
		return driver.findElement(ProdceedDdonation);
	}
	
	public WebElement user_Donatenow()
	{
		return driver.findElement(Donatenow);
	}

	public WebElement user_ClosethePopup()
	{
		return driver.findElement(ClosethePopup);
	}
	
	public WebElement Click_on_continue()
	{
		return driver.findElement(Click_on_continue);
	}
	
	
	}


