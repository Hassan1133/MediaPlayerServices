package com.example.notifications.Utils;

import android.app.Application;

import com.onesignal.OneSignal;
public class NotificationApplication extends Application
{
    private static final String ONE_SIGNAL_APP_ID = "7ddc2c3d-8677-4086-8c02-f9d3845e885b";

    @Override
    public void onCreate() {
        super.onCreate();

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONE_SIGNAL_APP_ID);


    }
}
