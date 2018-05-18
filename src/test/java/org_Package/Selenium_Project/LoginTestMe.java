package org_Package.Selenium_Project;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelUtility;

public class LoginTestMe {
	private WebDriver driver;
	
	private static int rownum=0;
	  private int colnum=2;
	  
  @Test(dataProvider="logindata",priority=1)
  public void test_me_login(String uname,String pass) throws Exception
  {
	  
	  
	 try {
		 
	  driver.findElement(By.id("userName")).clear();
	  //driver.findElement(By.id("userName")).sendKeys(ExcelUtility.getCellData(1, 1));
	  driver.findElement(By.id("userName")).sendKeys(uname);
	  driver.findElement(By.cssSelector("#password")).clear();
	  driver.findElement(By.cssSelector("#password")).sendKeys(pass);
	  driver.findElement(By.cssSelector("input.btn:nth-child(1)")).click();
	  
	 String title=driver.getTitle();
	 Assert.assertEquals(title,"Home");
	  
	  
	  ExcelUtility.setExcelCell(rownum, colnum, "Pass");
	 
	  		  
	 }
	 catch(Exception e) {
		 ExcelUtility.setExcelCell(rownum, colnum, "Fail");
	 }
	  finally{
		  rownum++;
		  //driver.navigate().back();
	  }
  }
  
 @Test(priority=2)
 public void select_Category() {
	 
	 WebElement category=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/a/span"));
	 Actions act=new Actions(driver);
	 act.moveToElement(category).click().build().perform();
	 
	 WebElement electonics=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/a/span"));
	 act.moveToElement(electonics).click().build().perform();
	 
	 WebElement HeadPhone=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a/span"));
	 act.moveToElement(HeadPhone).click().build().perform();
	 
	 //click on add to card
	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	 
	 
	 /*WebElement AddtoCart =driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
	 act.moveToElement(AddtoCart).click().build().perform();*/
	 
	
	 
	/*WebElement cart =driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]"));
	 act.moveToElement(cart).click().build().perform();*/
	 
	 driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
	 
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 
	 WebElement checkout =driver.findElement(By.xpath("/html/body/main/section/div[3]/table/tfoot/tr[2]/td[5]/a"));
	 act.moveToElement(checkout).click();
	 
	 
	 
	 WebElement proceedtopay =driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
	 act.moveToElement(proceedtopay).click();
	 
	 /*WebElement netbankingopt =driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label"));
	 act.moveToElement(netbankingopt).click().build().perform();*/
	 
	 
	 
	 
	 
	 
	 
			 
	 
 }
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\A06438_P5.training\\Desktop\\Drivers\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://localhost:8083/TestMeApp/login.htm");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  @DataProvider(name="logindata")
  public String[][] login_data() throws Exception
  {
	  ExcelUtility.setExcelPath("Sheet1","C:\\Nikhil\\TestData.xlsx");
	  String[][] tabledata=ExcelUtility.getExcelTable();
	return tabledata;
	  
  }

}
