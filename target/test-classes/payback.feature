Feature: Top menu bar options for Payback website	
 I want to be able to navigate the top menu bar on the Payback website
 	
 	Background: User on payback website
 		Given User opens google chrome
 		And user enters the url
 		Then user is on the payback website
 

	Scenario: Navigate to Banking partners
		Given I am on the Payback website
		When I click on the Earn points in the top menu bar
		And I click on the Banking parners
		Then I should be taken to the Banking partners
	
	Scenario: Navigate to Redeem points
  	Given I am on the Payback websitee
  	When I click on the redeem points in the top menu bar
  	And I click on the redeem points under Redeem points option
  	Then I should be taken to the redeem points page
  
  Scenario: Navigate to Coupons page
  	Given I am on the paybackk website
  	When I click on the Coupons in the top menu bar
  	And I click on the Coupons under Coupons option
  	Then I should be taken to the Coupons page

	Scenario: Navigate to Offers page
		Given I am on the payback websitte
		When I click on the Explore in the top menu bar
		And I click on the Offers
		Then I should be taken to the offers page
		
	Scenario: Navigate to Customer page
		Given I am on the paybacck website
		When I click on the payback website
		Then I should be taken to the Customer page
		
		
	
  	
  
		