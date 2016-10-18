package com.slbd.firebasetest;

import android.app.Application;

import com.deploygate.sdk.DeployGate;

/**
 * Created by slbd on 9/26/16.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DeployGate.install(this);
    }
}
