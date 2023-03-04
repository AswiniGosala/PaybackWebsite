Feature: Sign up for Payback website
    As a user
    		I want to sign up for the Payback website
    So that I can earn and redeem points
 Scenario: Successful sign up
    Given I am on the Payback websitee
    When I click on the Sign up button1
    And I enter my details1:
        | First name      | Imthiyaz           |
        | Last name       | shaik              |
        | Email           | imthiyaz@gmail.com |
        | PhoneNumber     | 7981809886         |
        | Date of birth   | 01-03-2023         |
    And I click on the Generate OTP1
    And I should see a otp entry page1
    Then I should able to see success message

Scenario: Unsuccessful sign up with invalid email
    Given I am on the Payback websitte
    When I click on the Sign up button2
    And I enter my details2:
        | First name    | Imthiyaz    |
        | Last name     | Shaik       |
        | Email         | shaik.com   |
        | PhoneNumber   | 7981809886  |
        | Date of birth | 01-03-2023  |
    And I click on the Generate OTP2
    Then I should see an error message indicating the invalid email format

Scenario: Unsuccessful sign up with existing email
    Given I am on the Payback webssite
    When I click on the Sign up button3
    And I enter my details3:
 		    | First name        | Imthiyaz           |  
        | Last name         | shaik              |
        | Email             | imthiyaz@gmail.com |
        | PhoneNumber       | 7981809886         |
        | Date of birth     | 01-03-2023         |
    And I click on the Generate OTP3
    Then I should see an error message indicating the email is already registered
    
  
Scenario: Unsuccessful sign up with invalid PhoneNumber
    Given I am on the Paybackk website
    When I click on the Sign up button4
    And I enter my details4:
        | First name       | Imthiyaz      |
        | Last name        | Shaik         |
        | Email            | shaik.com     |
        | PhoneNumber      | 7981809hie    |
         | Date of birth   | 01-03-2023    |
    And I click on the Generate OTP4
    Then I should see an error message indicating the invalid PhoneNumber format
  



