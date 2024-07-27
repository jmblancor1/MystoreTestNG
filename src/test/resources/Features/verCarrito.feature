Feature: Test the details of the ítem to add card

Background:User is logged in to myStore app
Given User is accessing myStore login Page
  When User enters valid username and password
  Then User should be able to navigate to Home Page
Scenario: Check the details of the product
  And User access to the clothes link
  And Click on the product
  Then User can see the details of the product
Scenario: Verify add to cart functionality
  And Clicks on Add to button
  Then Item should be added to the car


