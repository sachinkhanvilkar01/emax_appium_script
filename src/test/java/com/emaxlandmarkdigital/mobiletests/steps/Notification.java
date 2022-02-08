package com.emaxlandmarkdigital.mobiletests.steps;

import com.emaxlandmarkdigital.mobiletests.pageobjects.NotificationScreen;

public class Notification {

    private BaseSteps baseSteps;
    private NotificationScreen notificationScreen;

    public Notification(BaseSteps baseSteps){
        this.baseSteps=baseSteps;
        notificationScreen = new NotificationScreen(baseSteps.driver);
    }

}
