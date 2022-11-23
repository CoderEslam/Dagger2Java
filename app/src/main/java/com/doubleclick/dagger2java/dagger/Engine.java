package com.doubleclick.dagger2java.dagger;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */
public class Engine {
    private static final String TAG = "Engine";
    private String e1;
    private String e2;

    public Engine(String e1, String e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Inject
    public Engine() {
        Log.e(TAG, "Engine: "+toString());
    }

    public String getE1() {
        return e1;
    }

    public void setE1(String e1) {
        this.e1 = e1;
    }

    public String getE2() {
        return e2;
    }

    public void setE2(String e2) {
        this.e2 = e2;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "e1='" + e1 + '\'' +
                ", e2='" + e2 + '\'' +
                '}';
    }
}
