package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 11/24/2022
 */
public class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote() {

    }

    public Remote setListener(Car car) {
        Log.e(TAG, "Remote connected: " + car.toString());

        return this;
    }

    @Override
    public String toString() {
        return "call remote after calling method";
    }
}
