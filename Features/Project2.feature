Feature: all login tests for billing page

  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter valid username and valid password
    When I enter username "amol" and password as "amol123"
    And I click on login button
    Then I should be redirected to Home page


  Scenario: to test the functionality of login button for invalid username and password
    Given I am on login page
   # When I enter invalid username and valid password
    When I enter username "rahul" and password as "rahul123"
    And I click on login button
    Then I should get error message


  Scenario: to test the functionality of login button for another invalid username and password
    Given I am on login page
   # When I enter another valid username and valid password
    When I enter username "karishma" and password as "karishma123"
    And I click on login button
    Then I should get error message