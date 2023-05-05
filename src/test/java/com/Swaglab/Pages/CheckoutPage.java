package com.Swaglab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	private WebDriver driver;
	
	//initialize driver
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	private By cartBtn = By.cssSelector("a.shopping_cart_link");
	private By checkoutBtn = By.id("checkout");
	private By continueShoppingBtn = By.id("continue-shopping");
	
	//Action
	
	public void doAddToCart()
	{
		driver.findElement(cartBtn).click();
	}
	
	public void doCheckout()
	{
		driver.findElement(checkoutBtn).click();
	}
	
	public void doContinueShopping()
	{
		
		driver.findElement(continueShoppingBtn).click();
	}
	
}
