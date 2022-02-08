package com.emaxlandmarkdigital.mobiletests.steps;

import com.emaxlandmarkdigital.mobiletests.pageobjects.BasketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BasketScreen {

    private BaseSteps baseSteps;
    private BasketPage basketPage;

    public BasketScreen(BaseSteps baseSteps){
        this.baseSteps=baseSteps;
        basketPage=new BasketPage(baseSteps.driver);

    }

    @And("User update product QTY in the basket")
    public void user_update_product_qty_in_the_basket() throws InterruptedException {
        basketPage.updateProductQTY();
    }


    @Then("Verify shipping information text")
    public void verifyShippingInformationText() {
        String actualShippingText = basketPage.getShippingInfoText();
        Assert.assertEquals(actualShippingText,"Shipping charges may apply");
    }

    @Then("Verify Including VAT text")
    public void verifyIncludingVATText() {
        String actualVatText = basketPage.getIncludingVatText();
        Assert.assertEquals(actualVatText,"Including VAT");
    }

    @Then("Verify Got a Promo Text")
    public void verifyGotAPromoText() {
       String actualPromoText = basketPage.getGotAPromoText();
       Assert.assertEquals(actualPromoText,"Got a Promo/Voucher code?");
    }

    @Then("Verify Proceed To Checkout button")
    public void verifyProceedToCheckoutButton() {
        boolean result = basketPage.isUseItHereLinkDisplayed();
        Assert.assertTrue(result);
    }

    @Then("Verify Use It Here link")
    public void verifyUseItHereLink() throws InterruptedException {
       boolean result1 = basketPage.isProceedToCheckoutButtonDisplayed();
       Assert.assertTrue(result1);
       Thread.sleep(5000);
    }

    @And("Apply promo code {string}")
    public void applyPromoCode(String arg0) throws InterruptedException {

        basketPage.applyPromoCode(arg0);
    }
}
