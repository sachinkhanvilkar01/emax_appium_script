package com.emaxlandmarkdigital.mobiletests.steps;


import com.emaxlandmarkdigital.mobiletests.pageobjects.HomeScreen;
import com.emaxlandmarkdigital.mobiletests.pageobjects.NotificationScreen;
import com.emaxlandmarkdigital.mobiletests.pageobjects.SearchPage;
import com.emaxlandmarkdigital.mobiletests.pageobjects.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

    private BaseSteps baseSteps;

    private HomeScreen homeScreen;

    private SearchPage searchPage;

    private SearchResultPage searchResultPage;

    private NotificationScreen notificationScreen;

    public Search(BaseSteps baseSteps){
        this.baseSteps=baseSteps;
        homeScreen = new HomeScreen(baseSteps.driver);
        searchPage = new SearchPage(baseSteps.driver);
        searchResultPage = new SearchResultPage(baseSteps.driver);
        notificationScreen = new NotificationScreen(baseSteps.driver);
    }

    @Given("User is at home page of the application")
    public void user_is_at_home_page_of_the_application() {
        homeScreen.verifyEmaxLogoIsDisplayed();
    }

    @And("User clicks on search text box")
    public void user_clicks_on_search_text_box() throws InterruptedException {
        searchPage.clickOnSearchBox();
        Thread.sleep(5000);
    }

    @When("User enters search keywords")
    public void user_enters_search_keywords() throws InterruptedException {
        searchPage.searchProduct("iphone");
        Thread.sleep(5000);


    }

    @Then("Search result are displayed")
    public void search_result_are_displayed() throws InterruptedException {
        searchResultPage.isFilterIconDisplayed();
        Thread.sleep(5000);
    }

    @Given("User clicks on continue button in country switcher page")
    public void userClicksOnContinueButtonInCountrySwitcherPage() {
        notificationScreen.clickOnContinue();
    }
}
