package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 1/13/2023
 */
public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.e(TAG, "start: Petrol = " + horsePower);
    }
}
