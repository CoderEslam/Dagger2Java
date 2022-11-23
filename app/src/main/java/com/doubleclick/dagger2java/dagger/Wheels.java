package com.doubleclick.dagger2java.dagger;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */
public class Wheels {

    private int w1;
    private int w2;

    public Wheels(int w1, int w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    @Inject
    public Wheels() {
    }

    public int getW1() {
        return w1;
    }

    public void setW1(int w1) {
        this.w1 = w1;
    }

    public int getW2() {
        return w2;
    }

    public void setW2(int w2) {
        this.w2 = w2;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "w1=" + w1 +
                ", w2=" + w2 +
                '}';
    }
}
