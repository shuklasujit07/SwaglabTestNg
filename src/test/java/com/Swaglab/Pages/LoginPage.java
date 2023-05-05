package com.Swaglab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//Initialize Driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Login Page locator
	private By username = By.id("user-name");
	private By psw = By.id("password");
	private By loginbtn = By.id("login-button");
	
	
	//action
	public void doLogin(String un, String ps)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(psw).sendKeys(ps);
		driver.findElement(loginbtn).click();
	}

}
