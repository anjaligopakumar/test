package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.ContactUs;

public class Checktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		ContactUs cu = new ContactUs();
		cu.setName("Anjali", driver);
		cu.setEmail("anjali@gmail.com", driver);
		cu.setContact("547", driver);
		cu.setMessage("sdfad", driver);
		cu.setButton(driver);
		
	}

}
