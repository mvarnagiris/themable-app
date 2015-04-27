package com.themableapp;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig calligraphyConfig = new CalligraphyConfig.Builder()
                .setFontAttrId(R.attr.fontPath)
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .build();
        CalligraphyConfig.initDefault(calligraphyConfig);
    }
}
