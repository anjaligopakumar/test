package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumtesthover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com");
		Actions act = new Actions(driver);
		WebElement cor = driver.findElement(By.linkText("Courses"));
		act.moveToElement(cor).build().perform();
		//Thread.sleep(2000);
		WebElement aut = driver.findElement(By.linkText("Automation Testing Courses"));
		act.moveToElement(aut).build().perform();
		//Thread.sleep(2000);
		WebElement sel = driver.findElement(By.linkText("Selenium Training"));
		//Thread.sleep(2000);
		sel.click();
		
	}

}
