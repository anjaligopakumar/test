package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkingpasswrolms {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AnjaliP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/Login.aspx");
		driver.manage().window().maximize();
		FileInputStream fi;
		fi=new FileInputStream("E:\\AnjaliP\\Testdemo.xls");
		HSSFWorkbook hw= new HSSFWorkbook(fi);
		HSSFSheet hs = hw.getSheetAt(0);
		for(int i=1;i<=hs.getLastRowNum();i++)
		{
			int j=1;
			HSSFCell id,password;
			id=hs.getRow(i).getCell(j);
			password= hs.getRow(i).getCell(j+1);
			driver.findElement(By.id("txtLoginid")).sendKeys(id.toString());
			driver.findElement(By.id("txtpassword")).sendKeys(password.toString());
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.findElement(By.id("txtLoginid")).clear();
		}
		fi.close();
		
	}

}
