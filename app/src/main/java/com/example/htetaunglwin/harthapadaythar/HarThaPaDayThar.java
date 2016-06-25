package com.example.htetaunglwin.harthapadaythar;

import android.app.Application;
import android.content.Context;

/**
 * Created by Htet Aung Lwin on 24-Jun-16.
 */
public class HarThaPaDayThar extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
