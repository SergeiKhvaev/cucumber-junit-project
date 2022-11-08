Feature: Library app login functionality
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For scenarios in feature file, user is expected to be on login page
    Given user is on the library login page

  Scenario: login as a librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  Scenario: login as a student
   #Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

  Scenario: login as a admin
  #Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard