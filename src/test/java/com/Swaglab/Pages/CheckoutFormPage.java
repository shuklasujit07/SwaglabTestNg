package com.Swaglab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutFormPage {

	private WebDriver driver;
	
	//Initialize driver
	
	public CheckoutFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By fname = By.id("first-name");
	private By lname = By.id("last-name");
	private By zcode = By.id("postal-code");
	private By continueBtn = By.id("continue");
	private By cancelBtn = By.id("cancel");
	
	
	//Action
	
	public void doFormTest(String name, String Lname, String zCode)
	{
		driver.findElement(fname).sendKeys(name);
		driver.findElement(lname).sendKeys(Lname);
		driver.findElement(zcode).sendKeys(zCode);
		driver.findElement(continueBtn).click();
	}
	
}
