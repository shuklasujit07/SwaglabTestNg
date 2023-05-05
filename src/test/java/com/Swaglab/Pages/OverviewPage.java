package com.Swaglab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {
	
	private WebDriver driver;
	
	//initialize driver
	
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	private By itemOverview = By.xpath("//div[@id='checkout_summary_container']");
	private By finishBtn = By.id("finish");
	private By cancelBtn = By.id("cancel");
	
	//Action
	
	public void doOverview() {
		List <WebElement> overView = driver.findElements(itemOverview);
		for(WebElement i: overView)
		{
			System.out.println(i.getText());
		}
	}
	
	public void doFinish()
	{
		driver.findElement(finishBtn).click();
	}
}
