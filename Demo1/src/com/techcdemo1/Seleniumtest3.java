package com.techcdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		driver.findElement(By.name("txtName")).sendKeys("Anjali");
		//driver.findElement(By.id("txtEmail")).sendKeys("anjali0111123@gmail.com");
		//driver.findElement(By.id("txtContact")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\"txtMessage\"]")).sendKeys("Anjali is testing for selenium");
		//driver.findElement(By.name("btnSubmit")).click();
		Select sel= new Select(driver.findElement(By.id("ddlSubject")));
		//sel.selectByIndex(1);
		//sel.selectByVisibleText("Webinar Enquiry");
		sel.selectByValue("Feedback");
	}

}
