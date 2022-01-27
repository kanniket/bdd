#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Sign Up

  @tag2
  Scenario: Successful Sign Up With Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://gillette.com"
    And Mouse hover on Account
    And Click Login/Sign Up
    And Click Sign Up
    Then Enter Email Address as "rishavrishav2@gmail.com"
    And Enter Password as "Rishav@123"
    And Enter Confirm Password as "Rishav@123"
    And Enter First Name as "Rishav"
    And Enter Last Name as "Shrivastava"
    And Enter Zip as "58745"
    And Wait till captcha is checked
    And Click on Get Started
    Then Page Title should be "Gillette - Order Status"
    And close browser
