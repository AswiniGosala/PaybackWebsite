package com.demo.Payback;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TopStepdefination {
	WebDriver driver;
	WebDriverWait wait;
	 
	//TopPageFactory top;
  @Given("User opens google chrome")
	public void user_opens_google_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  
	}

	@Given("user enters the url")
	public void user_enters_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		  driver.get("https://www.payback.in/");
		
	}

	@Then("user is on the payback website")
	public void user_is_on_the_payback_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().window().maximize();
		String parenthandle=driver.getWindowHandle();
		System.out.println("parent window-"+parenthandle);
		Thread.sleep(4000);
		String title = driver.getTitle();
		  System.out.println("the title is :"+title);
		  System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	
	
@Given("I am on the Payback website")
public void i_am_on_the_Payback_website() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  Thread.sleep(4000);
	  
	  
	  
	  
	  //TopPageFactory top = new TopPageFactory(driver);
	 
	  // top = new TopPageFactory(driver);
	   //this.top=top;
	  
}

@When("I click on the Earn points in the top menu bar")
public void i_click_on_the_Earn_points_in_the_top_menu_bar() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	

	TopPageFactory top = new TopPageFactory(driver);
	  top.earnn();
	 
	//TopPageFactory top = new TopPageFactory(driver);
   // top.redemm();
	//Thread.sleep(2000);
	
	  
	  
	  
}

@When("I click on the Banking parners")
public void i_click_on_the_Banking_parners() throws InterruptedException, IOException {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);
	

	 top.bank();
	
	//Thread.sleep(2000);
	TakesScreenshot ts = (TakesScreenshot)driver;
	File file =ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,  new File("./ScreenShots/image1.png"));
	

	

	//TopPageFactory top = new TopPageFactory(driver);

	//top.red();
	//  Thread.sleep(2000);
	 
}

@Then("I should be taken to the Banking partners")
public void i_should_be_taken_to_the_Banking_partners() {
    // Write code here that turns the phrase above into concrete actions
	String data1=driver.findElement(By.xpath("//span[@class='pb-pink']")).getText();
	Assert.assertEquals("EARN POINTS AT BANKING PARTNERS", data1);
	System.out.println("opened banking partners page");
	driver.close();
	
	
}

@Given("I am on the Payback websitee")
public void i_am_on_the_Payback_websitee() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  
	  		//maximize the window
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
}

@When("I click on the redeem points in the top menu bar")
public void i_click_on_the_redeem_points_in_the_top_menu_bar() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);
    top.redemm();
	Thread.sleep(2000);
	  
}

@When("I click on the redeem points under Redeem points option")
public void i_click_on_the_redeem_points_under_Redeem_points_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);

	top.red();
	  Thread.sleep(2000);
	  
    
}

@Then("I should be taken to the redeem points page")
public void i_should_be_taken_to_the_redeem_points_page() {
    // Write code here that turns the phrase above into concrete actions
	String data1=driver.findElement(By.xpath("(//span[@class='pb-pink'])[1]")).getText();
	Assert.assertEquals("REDEEM POINTS FOR ANY REWARD CATEGORY BELOW", data1);
	System.out.println("redem points option is clicked");
	driver.close();
    
}

@Given("I am on the paybackk website")
public void i_am_on_the_paybackk_website() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	
	
}

@When("I click on the Coupons in the top menu bar")
public void i_click_on_the_Coupons_in_the_top_menu_bar() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	TopPageFactory top = new TopPageFactory(driver);

	 
	  top.coup();
	  Thread.sleep(2000);
	  System.out.println("coupons option is clicked");
	  
}

@When("I click on the Coupons under Coupons option")
public void i_click_on_the_Coupons_under_Coupons_option() throws InterruptedException, IOException {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);
           top.coups();
	  	  Thread.sleep(2000);
	  	TakesScreenshot ts = (TakesScreenshot)driver;
		File file =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,  new File("./ScreenShots/image2.png"));
	  	
		
		
		
    
}

@Then("I should be taken to the Coupons page")
public void i_should_be_taken_to_the_Coupons_page() {
    // Write code here that turns the phrase above into concrete actions
	String data1=driver.findElement(By.xpath("//span[@class='pb-blue coupon-heading-title']")).getText();
	Assert.assertEquals("coupons", data1);
	driver.close();
    
}

@Given("I am on the payback websitte")
public void i_am_on_the_payback_websitte() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	
}

@When("I click on the Explore in the top menu bar")
public void i_click_on_the_Explore_in_the_top_menu_bar() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);

	  
	  top.exp();
	  Thread.sleep(2000);
	  
}
	 

@When("I click on the Offers")
public void i_click_on_the_Offers()  {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);
top.off();
	  
    
}

@Then("I should be taken to the offers page")
public void i_should_be_taken_to_the_offers_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String data1=driver.findElement(By.xpath("//span[@class='pb-blue']")).getText();
	Assert.assertEquals("Shopping Offers from PAYBACK", data1);
	System.out.println("offers option is clicked");
	driver.close();
}

@Given("I am on the paybacck website")
public void i_am_on_the_paybacck_website() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  		//navigate to app
	  driver.get("https://www.payback.in/");
	  		//maximize the window
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	
	
    
}

@When("I click on the payback website")
public void i_click_on_the_payback_website() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	TopPageFactory top = new TopPageFactory(driver);

	  top.cust();
	  Thread.sleep(2000);
	  System.out.println("customer care option is clicked");
}

@Then("I should be taken to the Customer page")
public void i_should_be_taken_to_the_Customer_page() {
    // Write code here that turns the phrase above into concrete actions
	String data1=driver.findElement(By.xpath("(//span[@class='pb-blue'])[1]")).getText();
	Assert.assertEquals("FREQUENTLY ASKED QUESTIONS", data1);
	String expUrl="https://www.payback.in/customer-care";
	String actUrl=driver.getCurrentUrl();
	Assert.assertEquals(actUrl, expUrl);
	driver.close();
    
}

	

}
