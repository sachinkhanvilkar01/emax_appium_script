package com.emaxlandmarkdigital.mobiletests.pageobjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class NotificationScreen {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "btnContinue")
    private MobileElement continueButton;

    public NotificationScreen (AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);

    }
    public void clickOnContinue(){
        continueButton.click();
    }
}
