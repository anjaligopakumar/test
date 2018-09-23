package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/upload");
		driver.findElement(By.id("uploadfile_0")).sendKeys("E:\\AnjaliP\\Testdemo.xls");
		driver.findElement(By.id("terms")).click();

	}

}
