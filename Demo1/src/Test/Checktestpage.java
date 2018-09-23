package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Page.ContactUsPage;

public class Checktestpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		ContactUsPage cup;
		cup=PageFactory.initElements(driver,ContactUsPage.class);
		cup.setName("Anjali");
		cup.setEmail("anjali@gmail.com");
		cup.setContact("547");
		cup.setMessage("sdfad");
		cup.setButton();

	}

}
