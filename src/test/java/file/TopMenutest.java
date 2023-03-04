package file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.Payback.TopPageFactory;


public class TopMenutest {
  @Test
  public void verification() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  TopPageFactory top = new TopPageFactory(driver);
	  
	  Thread.sleep(1000);
	  top.earnn();
	  //Thread.sleep(2000);
	  
	  top.bank();
	  Thread.sleep(2000);
	  
	  top.redemm();
	  Thread.sleep(2000);
	  top.red();
	  Thread.sleep(2000);
	  top.coup();
	  Thread.sleep(2000);
	  top.coups();
	  Thread.sleep(2000);
	  top.exp();
	  Thread.sleep(2000);
	  top.off();
	  Thread.sleep(2000);
	  top.cust();
	  Thread.sleep(2000);
	  
	
	  
 



  }
}
