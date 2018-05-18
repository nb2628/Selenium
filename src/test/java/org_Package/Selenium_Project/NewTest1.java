package org_Package.Selenium_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void firsttest() {
	  System.out.println("This is my first Test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before firstTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after firstTest");
  }
  @DataProvider(dp = "data1")
  
  
  
  

}
