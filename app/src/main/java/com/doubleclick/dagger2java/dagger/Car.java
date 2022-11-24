package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import androidx.annotation.NonNull;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */

public class Car {

    /*
     * ( Dagger call )
     * 1 - call constructor
     * 2 - inject fields
     * 3 - inject methods
     * */

    private static final String TAG = "Car";
    @Inject
    Engine engine;
    @Inject
    Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
        Log.e(TAG, "Car: Constarctor");
    }

    @Inject
    // only automatically executed by calling @Inject
    public void enableRemote(@NonNull Remote remote) {
        remote.setListener(this);
        Log.e(TAG, "enableRemote: " + remote.toString());
    }

//    @Inject
//    public Car() {
//    }

    public void drive() {
        Log.e(TAG, "driving..." + toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
