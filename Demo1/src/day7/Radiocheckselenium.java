package day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiocheckselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		//driver.findElement(By.id("exp-3")).click();
		//List<WebElement> mylist=new ArrayList<>();
		//System.out.println(driver.findElements(By.name("profession")).get(1).getText());
		//driver.findElements(By.name("profession")).get(1).click();
		
		List<WebElement> mylist= driver.findElements(By.name("profession"));
		for (Iterator iterator = mylist.iterator(); iterator.hasNext();) {
			WebElement el = (WebElement) iterator.next();
			if(el.getAttribute("value").equalsIgnoreCase("automation tester"))
			{
				el.click();
			}
			
		}
		
	}

}
