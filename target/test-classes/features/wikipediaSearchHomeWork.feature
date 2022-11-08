
Feature: Wikipedia Search Functionality
  User story: Wikipedia Search Functionality Header and image Verification

  Background:
    Given user is on Wikipedia home page
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button


  Scenario:  Wikipedia Search Functionality Header Verification
    Then user sees Steve Jobs is in the main header


  Scenario: Wikipedia Search Functionality Header Verification
    Then user sees Steve Jobs is in the image header


#TC#3: Wikipedia Search Functionality Header Verification
#1. user is on Wikipedia home page
#2. user types Steve Jobs in the wiki search box
#3. user clicks wiki search button
#4. user sees Steve Jobs is in the main header
#Note: Follow POM

#TC#4: Wikipedia Search Functionality Image Header Verification
#1. user is on Wikipedia home page
#2. user types Steve Jobs in the wiki search box
#3. user clicks wiki search button
#4. user sees Steve Jobs is in the image header
#Note: Follow POM
