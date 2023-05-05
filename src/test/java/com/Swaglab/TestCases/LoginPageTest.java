package com.Swaglab.TestCases;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass{
  @Test
  public void loginTest() {
	  
	  lp.doLogin("standard_user", "secret_sauce");
	  
  }
}
