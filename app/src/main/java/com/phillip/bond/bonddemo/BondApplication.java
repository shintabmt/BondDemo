package com.phillip.bond.bonddemo;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by USER on 6/22/2016.
 */
public class BondApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initCalligraphy();
        initCrashlytic();
    }

    private void initCalligraphy() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                .build()
        );
    }

    private void initCrashlytic() {
        Fabric.with(this, new Crashlytics());
    }
}
