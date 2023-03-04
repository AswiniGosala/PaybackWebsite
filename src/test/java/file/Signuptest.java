package file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.Payback.Signuppagefactory;

public class Signuptest {
  @Test
  public void verify() throws InterruptedException {
	  
		  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();//navigate to app
		  driver.get("https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp");//maximize the window
		  driver.manage().window().maximize();
		  Signuppagefactory top = new Signuppagefactory(driver);
		  
		 
		  top.Salutations();
		  Thread.sleep(2000);
		  top.Firstnames("imithiyaz");
		  Thread.sleep(2000);
		  
		  top.lastnames("shaik");
		  Thread.sleep(2000);
		  
		  top.email1();
		  Thread.sleep(3000);
		  top.phonenumber("7981809886");
		  Thread.sleep(2000);
		  
		  top.dates();
		  Thread.sleep(2000);
		  top.checkboxs();
		  
		  Thread.sleep(3000);
		  top.otp();
		  Thread.sleep(3000);
		  }
	  
	  
  }

