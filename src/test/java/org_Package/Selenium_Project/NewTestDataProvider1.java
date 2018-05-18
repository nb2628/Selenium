package org_Package.Selenium_Project;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestDataProvider1 {
  @Test(dataProvider = "dp")
  public void f1(String uid, String pwd) {
	  System.out.println("user is "+uid);
	  System.out.println("password is "+pwd);
	  System.out. println(uid+"  "+pwd);
  }

  @DataProvider()
  public String[][] dp() {
    return new String[][] {
      new String[] { "uid1", "pwd1" },
      new String[] { "uid2", "pwd2" },
    };
  }
}
