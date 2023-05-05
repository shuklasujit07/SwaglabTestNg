package com.Swaglab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	 private WebDriver driver;
	 
	 //Initialize Driver
	 
	 public InventoryPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 //locator of inventory page
	 private By itemList = By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name']");
	 private By cartBtn= By.xpath("//button[text()='Add to cart']");
	 
	 //Action
	 
	 public void itemlistCount()
	 {
		 List <WebElement> list = driver.findElements(itemList);
		 System.out.println("Total item List available on page: "+list.size());
	 }
	 
	 public void itemName()
	 {
		 List <WebElement> list1 = driver.findElements(itemList);
		 for(WebElement i : list1)
		 {
			 System.out.println(i.getText());
		 }
	 }
	 
	 public void addToCart(String pname)
	 {
		 List <WebElement> list2 = driver.findElements(itemList);
		 for(WebElement i : list2)
		 {
			 try
			 {
			 if(i.getText().contains(pname))
			 {
				 i.click();
				 driver.findElement(cartBtn).click();
			 }
			 }catch(StaleElementReferenceException e)
			 {
				 List <WebElement> list3 = driver.findElements(itemList);
				 for(WebElement i1 : list3)
				 {
					 if(i1.getText().contains(pname))
					 {
						 i1.click();
						 driver.findElement(cartBtn).click();
					 } 
				 }
			 }
		 }
	 }
}
