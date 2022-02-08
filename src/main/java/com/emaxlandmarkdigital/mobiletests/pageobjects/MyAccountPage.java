package com.emaxlandmarkdigital.mobiletests.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MyAccountPage {

    private AndroidDriver driver;

    @AndroidFindBy (accessibility = "btnSignIn")
    private MobileElement loginButton;

    @AndroidFindBy (accessibility = "tToolbarTitle")
    private MobileElement myAccountPageTitle;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"txtSignUp\"])[2]")
    private MobileElement signUpLink;

    @AndroidFindBy (accessibility = "tochangeCountryNavigationItem")
    private MobileElement countrySwitcherLink;

    public MyAccountPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }
    public boolean isLoginButtonDisplayed(){
        return loginButton.isDisplayed();
    }

    public String getPageTitle(){
        return (myAccountPageTitle.getText());
    }

}
