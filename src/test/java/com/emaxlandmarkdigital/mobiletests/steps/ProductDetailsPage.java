package com.emaxlandmarkdigital.mobiletests.steps;


import com.emaxlandmarkdigital.mobiletests.pageobjects.ProductDetails;
import com.emaxlandmarkdigital.mobiletests.pageobjects.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ProductDetailsPage {

    private BaseSteps baseSteps;

    private ProductDetails productDetails;

    private SearchResultPage searchResultPage;

    public ProductDetailsPage(BaseSteps baseSteps){
        this.baseSteps=baseSteps;
        productDetails = new ProductDetails(baseSteps.driver);
        searchResultPage = new SearchResultPage(baseSteps.driver);
    }

    @Given("User click on first product in search result page")
    public void user_click_on_first_product_in_search_result_page() {
        searchResultPage.selectProduct();

    }

    @Given("User clicks on add to basket")
    public void user_clicks_on_add_to_basket() throws InterruptedException {
        productDetails.clickAddToBasketButton();
        Thread.sleep(5000);
    }


}
