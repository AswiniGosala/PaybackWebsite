package file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.Payback.TopPageFactory;

public class Topmenutestng {
  @Test(priority=0,groups="regression")
  public void BankingPartners() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  TopPageFactory top = new TopPageFactory(driver);
	 
	  top.earnn();
	  top.bank();
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test(priority=1,groups="regression")
  public void RedeemPoints() throws InterruptedException
  
  {
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  TopPageFactory top = new TopPageFactory(driver);
	  top.redemm();
	  top.red();
	  Thread.sleep(2000);
	  driver.close();
  }
  @Test(priority=2,groups="add")
  public void  Coupons() throws InterruptedException
  {
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  TopPageFactory top = new TopPageFactory(driver);
	  top.coup();
	 top.coups();
	  Thread.sleep(2000);
	  driver.close();
	 
    
  }
  @Test(priority=3,groups="sanity")
     public void Offers() throws InterruptedException
  {
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  TopPageFactory top = new TopPageFactory(driver);
	  top.exp();
	
	  top.off();
	  Thread.sleep(2000);
	  driver.close();
	  
  }
  @Test(priority=4,groups="add")
     public void Customercare() throws InterruptedException
     {
    	 System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
   	  WebDriver driver = new ChromeDriver();
   	  		//navigate to app
   	  driver.get("https://www.payback.in/");
   	  		//maximize the window
   	  driver.manage().window().maximize();
   	  TopPageFactory top = new TopPageFactory(driver);
    	top.cust();
	  Thread.sleep(2000);
	  driver.close();
    	 
     }
   
	 
	  
  
}
