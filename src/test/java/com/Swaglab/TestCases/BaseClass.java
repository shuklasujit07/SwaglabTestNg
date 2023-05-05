package com.Swaglab.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Swaglab.Pages.*;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CheckoutPage cp;
	public CheckoutFormPage cfp;
	public OverviewPage op;
	
	@BeforeTest
  public void browserSetup() {
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		lp = new LoginPage(driver);
		ip = new InventoryPage(driver);
		cp = new CheckoutPage(driver);
		cfp = new CheckoutFormPage(driver);
		op = new OverviewPage(driver);
		
  }
	
	@BeforeClass
	
	public void PageSetup()
	{
		lp.doLogin("standard_user", "secret_sauce");
		ip.addToCart("Sauce Labs Bike Light");
		cp.doAddToCart();
		cp.doCheckout();
		cfp.doFormTest("Sujit", "Shukla", "445203");
	}
	
	public void WaitFunction()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
