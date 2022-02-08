package com.emaxlandmarkdigital.mobiletests.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SearchPage {

    private AndroidDriver driver;

    @AndroidFindBy (accessibility = "tiSearchInput")
    private MobileElement searchTextBox;

    public SearchPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }

    public void clickOnSearchBox(){
        searchTextBox.click();
    }
    public void enterTextSearchBox(){
        searchTextBox.sendKeys("iphone");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public SearchResultPage searchProduct(String productName) throws InterruptedException {
        Thread.sleep(5000);
        searchTextBox.click();
        Thread.sleep(5000);
        searchTextBox.sendKeys(productName);
        Thread.sleep(5000);
        MobileElement automSuggestionText = (MobileElement) driver.findElementByXPath("//android.widget.TextView[starts-with(@text,'"+ productName +"')]");
        automSuggestionText.click();
        Thread.sleep(5000);
        return new SearchResultPage(driver);
    }

}
