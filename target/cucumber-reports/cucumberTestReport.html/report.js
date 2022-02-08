$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Basket.feature");
formatter.feature({
  "name": "This feature is to check basket page functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify QTY update basket functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button in country switcher page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.userClicksOnContinueButtonInCountrySwitcherPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is at home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_is_at_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search text box",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_on_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters search keywords",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_enters_search_keywords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Search.search_result_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on first product in search result page",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_click_on_first_product_in_search_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add to basket",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_clicks_on_add_to_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User update product QTY in the basket",
  "keyword": "And "
});
formatter.match({
  "location": "BasketScreen.user_update_product_qty_in_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify basket important elements or attributes",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button in country switcher page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.userClicksOnContinueButtonInCountrySwitcherPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is at home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_is_at_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search text box",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_on_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters search keywords",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_enters_search_keywords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Search.search_result_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on first product in search result page",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_click_on_first_product_in_search_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add to basket",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_clicks_on_add_to_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify shipping information text",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketScreen.verifyShippingInformationText()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Including VAT text",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketScreen.verifyIncludingVATText()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Got a Promo Text",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketScreen.verifyGotAPromoText()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Use It Here link",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketScreen.verifyUseItHereLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Proceed To Checkout button",
  "keyword": "Then "
});
formatter.match({
  "location": "BasketScreen.verifyProceedToCheckoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Apply invalid voucher functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on continue button in country switcher page",
  "keyword": "Given "
});
formatter.step({
  "name": "User is at home page of the application",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on search text box",
  "keyword": "And "
});
formatter.step({
  "name": "User enters search keywords",
  "keyword": "And "
});
formatter.step({
  "name": "Search result are displayed",
  "keyword": "And "
});
formatter.step({
  "name": "User click on first product in search result page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on add to basket",
  "keyword": "And "
});
formatter.step({
  "name": "Apply promo code \"\u003cpromoCode\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "promoCode"
      ]
    },
    {
      "cells": [
        "Promo10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Apply invalid voucher functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button in country switcher page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.userClicksOnContinueButtonInCountrySwitcherPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is at home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_is_at_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search text box",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_on_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters search keywords",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_enters_search_keywords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Search.search_result_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on first product in search result page",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_click_on_first_product_in_search_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add to basket",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_clicks_on_add_to_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Apply promo code \"Promo10\"",
  "keyword": "And "
});
formatter.match({
  "location": "BasketScreen.applyPromoCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ProductDetailsPage.feature");
formatter.feature({
  "name": "This feature is to check product page functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify add to basket functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button in country switcher page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.userClicksOnContinueButtonInCountrySwitcherPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is at home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_is_at_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search text box",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_on_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters search keywords",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_enters_search_keywords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Search.search_result_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on first product in search result page",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_click_on_first_product_in_search_result_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add to basket",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailsPage.user_clicks_on_add_to_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Search.feature");
formatter.feature({
  "name": "This feature is to check search functionality of the application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify search functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on continue button in country switcher page",
  "keyword": "Given "
});
formatter.match({
  "location": "Search.userClicksOnContinueButtonInCountrySwitcherPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is at home page of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_is_at_home_page_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search text box",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_clicks_on_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters search keywords",
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_enters_search_keywords()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search result are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.search_result_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});