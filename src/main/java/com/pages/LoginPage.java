package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By signup=By.linkText("SIGN UP");
	By Username= By.xpath("//*[@id='id_username']");
	By Password = By.xpath("//*[@id='id_password']");
	By SIGN1= By.xpath("//button[text()='SIGN IN']");
	
	By SIGNINN=By.linkText("SIGN IN");

	public WebElement clicksignin()
	{
		return driver.findElement(signup);
	}
	
	public WebElement enter_username()
	{
		return driver.findElement(Username);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(Password);
	}

	public WebElement clicksignIn()
	{
		return driver.findElement(SIGN1);
	}
}
