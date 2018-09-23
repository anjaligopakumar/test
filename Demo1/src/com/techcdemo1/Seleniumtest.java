package com.techcdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://w3schools.com");
		

	}

}
