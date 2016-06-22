package com.phillip.bond.bonddemo;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by USER on 6/22/2016.
 */
public class BondApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initCalligraphy();
    }

    private void initCalligraphy() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                .build()
        );
    }
}
