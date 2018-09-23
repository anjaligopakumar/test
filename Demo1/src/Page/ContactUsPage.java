package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {
	
	
	@FindBy(id="txtName")
	 WebElement nameparam;
	
	@FindBy(id="txtEmail")
	WebElement emailparam;
	
	@FindBy(id="txtContact")
	WebElement conparam;
	
	@FindBy(xpath ="//*[@id=\"txtMessage\"]")
	WebElement mesparam;
	
	@FindBy(name="btnSubmit")
	WebElement btnparam;
	
	public void setName(String s)
	{
	 nameparam.sendKeys(s);	
	}
	
	public void setEmail(String s)
	{
		emailparam.sendKeys(s);
	}

	public void setContact(String s)
	{
		conparam.sendKeys(s);
	}
	public void setMessage(String s)
	{
		mesparam.sendKeys(s);
	}
	public void setButton()
	{
		btnparam.click();
	}

}
