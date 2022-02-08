package com.emaxlandmarkdigital.mobiletests.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SearchResultPage {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "btnAddToBasketButton")
    private MobileElement addToBasketButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Filter']")
    private MobileElement filterIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index=0]")
    private MobileElement selectProduct;

    public SearchResultPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }
    public boolean isAddToBasketButtonDisplayed(){
       return addToBasketButton.isDisplayed();
    }
    public boolean isFilterIconDisplayed(){
       return filterIcon.isDisplayed();
    }
    public void selectProduct(){
        selectProduct.click();
    }
}
