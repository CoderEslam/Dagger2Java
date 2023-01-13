package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 1/13/2023
 */
public class Tires {

    private static final String TAG = "Car";


    public void inflate(int pump) {
        Log.e(TAG, "Tires: " + pump);
    }

}
