package org_Package.Selenium_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2 {
  @Test
  public void secondTest() {
	  System.out.println("This is my secondTest");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is my before secondTest");
  }

  @AfterTest
  public void afterTest() {
  
  System.out.println("This is my after secondTest");
  }

}
