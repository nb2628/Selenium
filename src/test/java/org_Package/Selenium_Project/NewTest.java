package org_Package.Selenium_Project;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {

	private WebDriver driver;
	@Test
  
  /*public void register() {
		
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("Nikhil");
		driver.findElement(By.name("lastName")).sendKeys("Bhosale");
		driver.findElement(By.name("phone")).sendKeys("64923869856");
		driver.findElement(By.id("userName")).sendKeys("123");
  }
  */
	
	public void login() {
		
		LoginPageObject.uname.sendKeys("Selenium");
		LoginPageObject.pass.sendKeys("Pass");
		LoginPageObject.Login.click();
				
	}
  @AfterClass
  public void afterClass() {
	  //driver.close();
	  //driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438_P5.training\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PageFactory.initElements(driver, LoginPageObject.class);
	  
  }

}
