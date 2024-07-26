Feature: Login page Automation of MyStore website
  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And Clicks on Login Button
    Then User is navigated to Home Page
    And Close the browser

    Examples:
      | username | password |
      | jmbr2004@gmail.com | Joyce.1984 |
      | jmbr2004@gmail.com | Joys.1984  |
      | jmbr2@gmail.com    | Joys.2001  |