package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */

public class Car {

    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

//    @Inject
//    public Car() {
//    }

    public void drive() {
        Log.d(TAG, "driving..." + toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
