Feature: Login page Automation of MyStore website
Scenario: Check login is successful with valid credentials
Given User is on login page
When User enters valid username and password
  When Clicks on Login Button
Then User is navigated to Home Page
  Then Close the browser