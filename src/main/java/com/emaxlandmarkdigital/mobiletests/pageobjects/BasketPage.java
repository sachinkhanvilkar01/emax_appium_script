package com.emaxlandmarkdigital.mobiletests.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasketPage {

    private AndroidDriver driver;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@index=0]")
    private MobileElement qtyDropDownButton;

    @AndroidFindBy(accessibility = "ttlRemoveButton")
    private MobileElement removeButton;

    @AndroidFindBy(accessibility = "btnProceedToCheckoutButton")
    private MobileElement proceedToCheckoutButton;

    @AndroidFindBy(accessibility = "txtDescription")
    private MobileElement shippingInfoText;

    @AndroidFindBy(accessibility = "txtGotPromoCode")
    private MobileElement gotPromoCodeText;

    @AndroidFindBy(accessibility = "ttlApply")
    private MobileElement promoCodeApplyLink;

    @AndroidFindBy(accessibility = "txtVat")
    private MobileElement includingVatText;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='2']")
    private MobileElement selectProductQTY;

    @AndroidFindBy(accessibility = "inpPromocode")
    private MobileElement promoInputBox;

    @AndroidFindBy(accessibility = "btnIsSubmitButton")
    private MobileElement applyVoucherButton;

    @AndroidFindBy(accessibility = "ttlRemove")
    private MobileElement cancelButton;

    public BasketPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }
    public void updateProductQTY() throws InterruptedException {
        Thread.sleep(5000);
        qtyDropDownButton.click();
        selectProductQTY.click();
        Thread.sleep(5000);
    }

    public String getShippingInfoText(){
        return shippingInfoText.getText();
    }

    public String getIncludingVatText(){
        return includingVatText.getText();
    }

    public String getGotAPromoText(){
        return gotPromoCodeText.getText();
    }

    public boolean isUseItHereLinkDisplayed(){
        return promoCodeApplyLink.isDisplayed();
    }

    public boolean isProceedToCheckoutButtonDisplayed(){
        return proceedToCheckoutButton.isDisplayed();
    }

    public void applyPromoCode(String arg0) throws InterruptedException {
        promoCodeApplyLink.click();
        Thread.sleep(5000);
        promoInputBox.sendKeys(arg0);
        Thread.sleep(5000);
        applyVoucherButton.click();
        Thread.sleep(30000);

    }
}
