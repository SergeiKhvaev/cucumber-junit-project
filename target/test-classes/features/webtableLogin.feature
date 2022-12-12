Feature: User should be able to Login with valid credentials

  Background:
    Given user is on the login Page of wab table app


  Scenario: Login with 1 parameter
    When user enter user name "Test"
    And user enter password "Tester"
    And user click to login button
    Then user should see url contains orders


  Scenario: Login scenario with 2 parameters
    When user enter username "Test" password "Tester" and logins
    Then user should see url contains orders
@table
  Scenario: Login scenario with data table
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders


#TC #: Login scenario
#1- Open a chrome browser 2- Go to:
#https://web-table-2.cydeo.com/login
#3- Enter  username:  Test
#4- Enter password: Tester
#5- Verify URL:
#Expected: URL should end with “orders”