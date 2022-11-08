Feature: Wikipedia Search Functionality and verifications

  Background:
    Given User is on Wikipedia home page


  Scenario: Wikipedia Search Functionality Title Verification
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title


  Scenario: Wikipedia Search Functionality Title Verification
    When User types "Lamborghini" in the wiki search box
    And User clicks wiki search button
    Then User sees "Lamborghini" is in the wiki title

  @scenarioOutlinePractice
  Scenario Outline:Wikipedia Search Functionality Title Verification
  with using DATA DRIVEN TESTING
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bill Gates        | Bill Gates        |
      | Harry Potter      | Harry Potter      |
      | Cristiano Ronaldo | Cristiano Ronaldo |
      | Elon Musk         | Elon Musk         |
      | Albert Einstein   | Albert Einstein   |






  #https://www.wikipedia.org/

  #TC#2: Wikipedia Search Functionality Title Verification
  #1. User is on Wikipedia home page
 # 2. User types Steve Jobs in the wiki search box
 # 3. User clicks wiki search button
 # 4. User sees Steve Jobs is in the wiki title