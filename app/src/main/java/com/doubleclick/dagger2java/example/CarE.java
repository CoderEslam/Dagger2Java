package com.doubleclick.dagger2java.example;

import android.util.Log;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */
public class CarE {

    private static final String TAG = "Car";
    private EngineE engine;
    private WheelsE wheels;


    public CarE(EngineE engine, WheelsE wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

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
