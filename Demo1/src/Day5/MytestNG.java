package Day5;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MytestNG {
	WebDriver driver;
@BeforeTest
public void BeforeTest() {
	System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/selenium/upload");
}
 	
  @Test
  public void uploadTest() {
	
		driver.findElement(By.id("uploadfile_0")).sendKeys("E:\\AnjaliP\\Testdemo.xls");
		driver.findElement(By.id("terms")).click();
  }
  
  
  @Test
  public void Test2() {
	
	
  }
  
  @AfterTest
  public void AfterTest() {
  	driver.close();
  }
}
