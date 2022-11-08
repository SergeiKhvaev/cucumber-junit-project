Feature: Etsy search verification
  User story: As a user when I am on etsy search page,
  I able to search whatever I want and see relevant information

  Background:  For scenarios in feature file, user is expected to be on home page
    Given user is on www.etsy.com



  Scenario: Verifying title on home page
   # Given user is on www.etsy.com
    Then user sees title Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Search functionality result title verification (without parameterization)
  Given user is on www.etsy.com
  When user types Wooden Spoon in the search box
    And  user clicks search button
    Then User sees Wooden Spoon is in the title


 Scenario: Search functionality result title verification (with parameterization)
  Given user is on www.etsy.com
    When user types "Apple" in the search box
   And  user clicks search button
   Then User sees "Apple - Etsy" is in the title




#TC#51: Etsy Title Verification
#1. User is on https://www.etsy.com
#2. User sees title is as expected.
#Expected: Shop for handmade, vintage, custom, and unique gifts for everyone
#Note: Follow POM

#TC#52: Etsy Search Functionality Title Verification (without parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title
#Note: Follow POM

#TC#53: Etsy Search Functionality Title Verification (with parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title
#Note: Follow POM
