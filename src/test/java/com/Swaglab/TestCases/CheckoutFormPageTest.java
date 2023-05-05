package com.Swaglab.TestCases;

import org.testng.annotations.Test;

public class CheckoutFormPageTest extends BaseClass{
  @Test
  public void checkoutFormTest() {
	  cfp.doFormTest("Sujit", "Shukla", "445203");
  }
}
