package com.demo.Payback;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopPageFactory {
	 WebDriver driver = null;
	///	@FindBy(xpath="//a[@data-clicktext='Login']")
		// login;
		//@FindBy(xpath="//a[@href='https://www.gyftr.com/payback/affiliates?utm_source=paybackportal&utm_medium=signuppage&utm_campaign=paybackapp']")
		//WebElement Mobile;
//		@FindBy(xpath="//*[@id=\"__next\"]/section/div/div[1]/div/div[2]/div[1]/input")
	//	WebElement pin;
		//@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
		//WebElement robo;
		//@FindBy(xpath="//button[@class='btn pb-login-submit red-button']")
		//WebElement log;
		@FindBy(xpath="//a[@class='pb-title-menu']")
		WebElement earn;
		@FindBy(xpath="//a[@data-clicktext='Banking Partners']")
		WebElement banking;
		@FindBy(xpath="(//a[@class='pb-title-menu'])[2]")
		//@FindBy(xpath="//a[@class='pb-title-menu']")
		WebElement redem;
		@FindBy(xpath="//a[@data-clicktext='Redeem Points']")
		WebElement redemp;
		@FindBy(xpath="//*[@id=\"myNavbar\"]/ul[2]/li[3]/a")
		WebElement coupon;
		@FindBy(xpath="//a[@data-clicktext='Coupons']")
		WebElement coupons;
		@FindBy(xpath="//*[@id=\"myNavbar\"]/ul[2]/li[4]/a")
		WebElement explore;
		@FindBy(xpath="//a[@data-clicktext='Offers']")
		WebElement offers;
		@FindBy(xpath="//a[@class='nav-link pb-customer-link']")
		WebElement customer;
		
		public TopPageFactory(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//public void paylog()
		//{
	//		login.click();
//			Mobile.click();
			
			//robo.click();
			
		//}
	
		public void earnn()
		
		{
			Actions act = new Actions(driver);
			act.moveToElement(earn).click().build().perform();
			//earn.click();
		}
		
		public void bank()
		{
			banking.click();
			
		}
		
		
		public void redemm()
		{
			redem.click();
		}
		public void red()
		{
			
			redemp.click();
			
		}
		public void coup()
		{
			coupon.click();
		}
		public void coups()
		{
			coupons.click();
		}
		public void exp()
		{
			explore.click();
		}
		public void off()
		{
			offers.click();
			
		}
		public void cust()
		{
			customer.click();
		}
		
			 
		


}
