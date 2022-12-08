@HomePage
Feature: Generate run time user
 
  Scenario Outline: Generate Fisrt User (Sender)
    Given valid endpoint to fetch users
    When request is send to server "<endpoint>"
    Then extract the information of first user 
    Examples:
    |endpoint|
    |api/?nat=us&randomapi|
    
  Scenario Outline: User Registration and Purchase order
   	Given Open the url "<url>"
    When User click on create an account link
    Then Verify user registration page open
    And User enter details "<password>"
    Then Click on create an account button
    Then User select jackets for men
    Then User choose the jacket
    Then User click on add to cart button
    Then User click on proceed to check out button
    Then Enter street addres
    And Enter city
    And Select state
    And Enter Zip code
    And Enter Phone number
    Then Select shipping method
    Then Click on next button
    Then Click on place order button
    Then Extract the order number
    Examples:
    |url||password|
    |https://magento.softwaretestingboard.com/||Unlimint@56789|
