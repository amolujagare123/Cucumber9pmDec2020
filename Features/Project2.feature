Feature: all login tests for billing page

  @valid
  Scenario: to test the functionality of login button for valid username and password
    Given I am on login page
    #When I enter valid username and valid password
    When I enter username "amol" and password as "amol123"
    And I click on login button
    Then I should be redirected to Home page

  @parameter
  Scenario: to test the functionality of login button for invalid username and password
    Given I am on login page
   # When I enter invalid username and valid password
    When I enter username "rahul" and password as "rahul123"
    And I click on login button
    Then I should get error message

  @parameter
  Scenario: to test the functionality of login button for another invalid username and password
    Given I am on login page
   # When I enter another valid username and valid password
    When I enter username "karishma" and password as "karishma123"
    And I click on login button
    Then I should get error message


  @userReg
  Scenario Outline: to test the user registration
    Given I am on the user registration page
    When I enter  data <name> , <email> , <phone> , <city>
     And I click on submit button
    Then I verify that the user registred successfully

    Examples:
      | name  | email  | phone  | city  |
      | name1 | email1 | phone1 | city1 |
      | name2 | email2 | phone2 | city2 |
      | name3 | email3 | phone3 | city3 |
      | name4 | email4 | phone4 | city4 |

  @userReg1
  Scenario: to test the user registration
    Given I am on the user registration page
    When I enter  data below
      |amol | amol@gmail.com | 98989 | pune |










