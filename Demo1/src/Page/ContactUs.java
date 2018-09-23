package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {
	
		
		// TODO Auto-generated method stub
	
		By nameparam = By.id("txtName");
		By emailparam = By.id("txtEmail");
		By conparam = By.id("txtContact");
		By mesparam = By.xpath("//*[@id=\"txtMessage\"]");
		By btnparam = By.name("btnSubmit");
		public void setName(String s, WebDriver driver)
		{
			driver.findElement(nameparam).sendKeys(s);
		}
		
		public void setEmail(String s , WebDriver driver)
		{
			driver.findElement(emailparam).sendKeys(s);
		}

		public void setContact(String s, WebDriver driver)
		{
			driver.findElement(conparam).sendKeys(s);
		}
		public void setMessage(String s, WebDriver driver )
		{
			driver.findElement(mesparam).sendKeys(s);
		}
		public void setButton(WebDriver driver)
		{
			driver.findElement(btnparam).click();
		}
}
