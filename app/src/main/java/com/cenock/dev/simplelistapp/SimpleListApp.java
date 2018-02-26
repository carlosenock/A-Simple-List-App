package com.cenock.dev.simplelistapp;

import android.annotation.SuppressLint;

import cleancore.dev.cenock.com.core.App;
import cleancore.dev.cenock.com.core.Config;

/**
 * Created by carlosenock on 2/25/18.
 */

public class SimpleListApp extends App {


    @SuppressLint("ResourceType")
    @Override
    public void onCreate() {
        super.onCreate();

        //API CONFIGURATION
        Config.setApiBaseUrl(getBaseContext().getString(R.string.base_api_url));
    }
}
