package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created By Eslam Ghazy on 1/13/2023
 */
@Module
public class WheelsModule {

    private static final String TAG = "Car";

    private int sum;

    public WheelsModule(int sum) {
        this.sum = sum;
        Log.e(TAG, "WheelsModule: ");
    }

    // do @Provides when I need inject class I don't own it
    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTries() {
        Tires tires = new Tires();
        tires.inflate(sum);
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(tires, rims);
    }
}
