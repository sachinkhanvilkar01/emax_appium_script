package com.emaxlandmarkdigital.mobiletests.steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private BaseSteps baseSteps;

    public Hooks(BaseSteps baseSteps){
        this.baseSteps=baseSteps;
    }
    @Before
    public void setUpAppium() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus6");
//      cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-M315F/DS");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//       cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.UDID, "RZ8R72R6NCX");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("appPackage", "com.landmarkgroup.emax");
        cap.setCapability("appActivity", "com.landmarkgroupreactapps.MainActivity");

        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "BL_1.12_12_SPRINT_12_FEB_07.apk";

        cap.setCapability(MobileCapabilityType.APP, appUrl);

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        baseSteps.driver = new AndroidDriver(url, cap);
        Thread.sleep(50000);
        baseSteps.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        baseSteps.driver.quit();
    }
}
