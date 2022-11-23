package com.doubleclick.dagger2java.dagger;

import com.doubleclick.dagger2java.MainActivity;

import dagger.Component;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */
@Component
public interface CarComponent {

    Car getCar();

    Engine getEngine();

    void inject(MainActivity mainActivity);
}
