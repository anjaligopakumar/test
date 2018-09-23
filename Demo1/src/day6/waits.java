package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com");
		WebDriverWait wait =new WebDriverWait(driver,60);
		WebElement ele;
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		ele=(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Courses")));
		act.moveToElement(ele).build().perform();
		//WebElement cor = driver.findElement(By.linkText("Courses"));
		//act.moveToElement(cor).build().perform();
		//Thread.sleep(2000);
		WebElement aut = driver.findElement(By.linkText("Automation Testing Courses"));
		act.moveToElement(aut).build().perform();
		//Thread.sleep(2000);
		WebElement sel = driver.findElement(By.linkText("Selenium Training"));
		//Thread.sleep(2000);
		sel.click();
		

	}

}
