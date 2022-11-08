Feature:User should be able to place order and order seen in web table


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "Visa"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

    #env=https://web-table-2.cydeo.com/login
  #data Driven test (DDT) example

  @WebTableOrder
  Scenario Template: User should be able to place order and order seen in web table with using DDT
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expireDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table


    # we can have more than one examples and to define which one
      # expamples we want to run we use tag, which we wil pass to CukesRunner

    @femaleScientiests
    Examples: famous female scientists
      | productType | quantity | customerName      | street                  | city     | state   | zipCode | cardType         | cardNumber       | expireDate | expectedName      |
      | Familybea   | 2        | Rosalind Franklin | 123 By Palm Street      | Cvebec   | Canada  | 12344   | MasterCard       | 9991222233334444 | 11/26      | Rosalind Franklin |
      | MoneyCog    | 4        | Lubava Khvalev    | 48 Coas more Street     | London   | England | 45553   | Visa             | 1111222233334444 | 10/24      | Lubava Khvalev    |
      | Screenable  | 5        | Katy Starovoitova | 221B Baker Street       | Ikrutsk  | Russia  | 55445   | American Express | 1111222233334444 | 10/25      | Katy Starovoitova |
      | Familybea   | 9        | Eva Cotysh        | 23A Cotton candy Street | New York | USA     | 32333   | Visa             | 1111222233334444 | 12/23      | Eva Cotysh        |

    @maleScientiests
    Examples: famous male scientists
      | productType | quantity | customerName      | street                  | city     | state   | zipCode | cardType         | cardNumber       | expireDate | expectedName      |
      | Familybea   | 2        | Tom Franklin      | 123 By Palm Street      | Cvebec   | Canada  | 12344   | MasterCard       | 9991222233334444 | 11/26      | Tom Franklin      |
      | MoneyCog    | 4        | Sergei Khvalev    | 48 Coas more Street     | London   | England | 45553   | Visa             | 1111222233334444 | 10/24      | Sergei Khvalev    |
      | Screenable  | 5        | John Starovoitova | 221B Baker Street       | Ikrutsk  | Russia  | 55445   | American Express | 1111222233334444 | 10/25      | John Starovoitova |
      | Familybea   | 9        | Anatoly Cotysh    | 23A Cotton candy Street | New York | USA     | 32333   | Visa             | 1111222233334444 | 12/23      | Anatoly Cotysh    |
