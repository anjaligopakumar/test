package com.techcdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest4 {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://lms.techcanvass.co.in/Login.aspx");
	//driver.findElement(By.id("txtLoginid")).sendKeys("abc");
	
	driver.findElement(By.cssSelector("input[name='txtLoginid']")).sendKeys("abc");
	System.out.println(driver.findElement(By.id("txtpassword")).getCssValue("height"));
	System.out.println(driver.findElement(By.id("txtpassword")).getCssValue("color"));
	driver.findElement(By.id("txtpassword")).sendKeys("abc");
	driver.findElement(By.name("btnLogin")).click();
	//driver.findElement(By.xpath)
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
}
}
