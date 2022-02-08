package com.emaxlandmarkdigital.mobiletests.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomeScreen {

    private AndroidDriver driver;

    @AndroidFindBy(accessibility = "btnTabBarHome")
    private MobileElement homeTab;

    @AndroidFindBy(accessibility = "btnTabBarShop")
    private MobileElement shopTab;

    @AndroidFindBy(accessibility = "btnTabBarBasket")
    private MobileElement basketTab;

    @AndroidFindBy(accessibility = "btnTabBarMyAccount")
    private MobileElement myAccountTab;

    @AndroidFindBy(accessibility = "iLogo")
    private MobileElement emaxLogo;

    public HomeScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }
    public void clickShopTab(){
        shopTab.click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public void clickBasketTab(){
        basketTab.click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public void clickMyAccountTab(){
        myAccountTab.click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public void verifyEmaxLogoIsDisplayed(){
        emaxLogo.isDisplayed();
    }
}
