package com.Swaglab.TestCases;

import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseClass{
  @Test(priority = 1)
  public void CartClickTest() 
  {
	  cp.doAddToCart();
  }
  
  @Test(priority = 2)
  public void checkoutBtnTest()
  {
	  cp.doCheckout();
  }
}
