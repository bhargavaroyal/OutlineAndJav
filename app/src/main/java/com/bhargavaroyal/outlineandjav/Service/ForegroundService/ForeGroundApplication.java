package com.bhargavaroyal.outlineandjav.Service.ForegroundService;

import android.app.Application;

import com.bhargavaroyal.outlineandjav.R;

public class ForeGroundApplication extends Application {

    private static ForeGroundMyAppsNotificationManager notificationManager;

    @Override
    public void onCreate() {
        super.onCreate();
        notificationManager = ForeGroundMyAppsNotificationManager.getInstance(this);
        notificationManager.registerNotificationChannelChannel(
                getString(R.string.channelId),
                "BackgroundService",
                "BackgroundService");
    }

    public static ForeGroundMyAppsNotificationManager getMyAppsNotificationManager(){
        return notificationManager;
    }
}
