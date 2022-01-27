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
Feature: Reset Password

  Scenario: Reset Password
    Given User Launch Chrome browser
    When User opens URL "https://gillette.com"
    And Mouse hover on Account
    And Click Login/Sign Up
    And Click Forgot Password
    Then Enter Email as "rishav.x.rishu@gmail.com"
    And Click on Reset Password
    And close browser