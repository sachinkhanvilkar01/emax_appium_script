package com.emaxlandmarkdigital.mobiletests.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductDetails {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "btnAddToBasketButton")
    private MobileElement addToBasketButton;

    public ProductDetails(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }
    public boolean isAddToBasketButtonDisplayed(){
        return addToBasketButton.isDisplayed();
    }
    public void clickAddToBasketButton(){
        addToBasketButton.click();
    }

}
