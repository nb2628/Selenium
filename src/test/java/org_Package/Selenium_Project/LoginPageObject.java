package org_Package.Selenium_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {

	@FindBy(how=How.NAME, using="userName")
	public static WebElement uname  ;
	//public static Object uname1;
	
	@FindBy(how=How.NAME, using="password")
	public static WebElement pass;
	
	@FindBy(how=How.NAME, using="login")
	public static WebElement Login ;
	
}
