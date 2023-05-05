package com.Swaglab.TestCases;

import org.testng.annotations.Test;

public class OverviewPageTest extends BaseClass {
  @Test(priority = 1)
  public void overViewPageTest() {
	  op.doOverview();
  }
  
  @Test(priority = 2)
  public void finishBtnTest()
  {
	  op.doFinish();
  }
}
