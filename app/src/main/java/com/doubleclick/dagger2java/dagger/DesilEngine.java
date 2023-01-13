package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 1/13/2023
 */
public class DesilEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public DesilEngine() {
    }

    @Override
    public void start() {
        Log.e(TAG, "start: Diesel");
    }
}
