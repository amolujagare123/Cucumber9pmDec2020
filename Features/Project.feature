Feature: all login tests for billing page

  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    When I enter valid username and valid password
    And I click on login button
    Then I should be redirected to Home page