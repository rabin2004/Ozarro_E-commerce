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

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
#@oec-50
#Scenario: plus sign quantity increase 
#Given     User enters url "https://ozarro.shop/"
#And       click on shop link
#When      user click on Headphones USB Wires product
#And       user clicks on plus sign
#Then      number of product quantity should increased
#
#@oec-46
#Scenario: Headphones USB Wires
#Given     User enters url "https://ozarro.shop/"
#And       click on shop link
#When      user click on Headphones USB Wires product
#Then      user should be able to see Headphones USB
#
#
#@oec-52   
#Scenario: Edit quantity box
#Given     User enters url "https://ozarro.shop/"
#And       click on shop link
#When      user click on Headphones USB Wires product
#And       user can type the number of quantity
#Then      edit box should be editable

#@oec-53   
#Scenario: Add to cart box
#Given     User enters url "https://ozarro.shop/"
#And       click on shop link
#When      user click on Headphones USB Wires product2
#And       user can add  the number of quantity using add to cart
#Then      user should find the number of quantity on the cart box


@oec-72   
Scenario: Sort by price from low to high
Given     User enters url "https://ozarro.shop/"
And       click on shop link
When      user clicks on dropdown below the black bar
And       user clicks on Sort by price: low to high
Then      product list should be sorted by price from low to high


#@oec-67
#Scenario: Search button functionality
#Given     User enters url "https://ozarro.shop/"
#And       click on shop link
#When      user clicks on search button
#Then      user should see list of products
#
#
#@oec-68
#Scenario: User can search by pressing enter key
#Given     User enters url "https://ozarro.shop/"
#And       click on shop link
#When      user types on laptop
#And       user presses enter key
#Then      user should see search results contains word laptop




