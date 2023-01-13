package com.doubleclick.dagger2java.dagger;

import javax.inject.Inject;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */
public class Wheels {
    // we don't own this class so we can't annotate it with @Inject

    private Tires tires;
    private Rims rims;

    public Wheels(Tires tires, Rims rims) {
        this.tires = tires;
        this.rims = rims;
    }
}
