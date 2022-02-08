Feature: This feature is to check basket page functionality


  Scenario: Verify QTY update basket functionality

    Given User clicks on continue button in country switcher page
    Then User is at home page of the application
    And User clicks on search text box
    And User enters search keywords
    And Search result are displayed
    And User click on first product in search result page
    And User clicks on add to basket
    And User update product QTY in the basket

  Scenario: Verify basket important elements or attributes
#    Given User clicks on continue button in country switcher page
#    Then User is at home page of the application
#    And User clicks on search text box
#    And User enters search keywords
#    And Search result are displayed
#    And User click on first product in search result page
#    And User clicks on add to basket
    Then Verify shipping information text
    Then Verify Including VAT text
    Then Verify Got a Promo Text
    Then Verify Use It Here link
    Then Verify Proceed To Checkout button

  Scenario Outline: Apply invalid voucher functionality
    Given User clicks on continue button in country switcher page
    Then User is at home page of the application
    And User clicks on search text box
    And User enters search keywords
    And Search result are displayed
    And User click on first product in search result page
    And User clicks on add to basket
    And Apply promo code "<promoCode>"

    Examples:
      | promoCode |
      | Promo10 |