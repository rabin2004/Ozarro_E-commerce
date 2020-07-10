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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Communicating ozarro.shop with valid credential
    Given user launch browser
    And user enters url to land in homepage
    When user clicks contact us link 
    And user lands in contact us page
    And user fills contact us form with valid credentials
    Then user clicks send button
    And user sees that message send is successful

  
     @tag2
  Scenario: Communicating ozarro.shop with invalid credential
    Given user launch browser
    And user enters url to land in homepage
    When user clicks contact us link 
    And user lands in contact us page
    And user fills contact us form with invalid credentials
    Then user clicks send button
    And user sees that message send is unsuccessful
     
     
     @tag3
  Scenario: Communicating ozarro.shop with no credential
    Given user launch browser
    And user enters url to land in homepage
    When user clicks contact us link 
    And user lands in contact us page
    And user doesnot fills contact us form 
    Then user clicks send button
    And error message is displayed 
     
     
     
     
     
     
     
     
     
