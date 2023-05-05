package com.Swaglab.TestCases;

import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass {
  
	@Test(priority = 1)
  public void inventoryItemCount() 
	{
		
		ip.itemlistCount();	
	}
	@Test(priority = 2)
	
	public void inventoryItemNames() 
	{
		ip.itemName();
	}
	
	@Test (priority = 3)
	
	public void addToCartTest() 
	{
		ip.addToCart("Sauce Labs Bike Light");
	}
	
}
