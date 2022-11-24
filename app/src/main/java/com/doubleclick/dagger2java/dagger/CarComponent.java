package com.doubleclick.dagger2java.dagger;

import com.doubleclick.dagger2java.MainActivity;

import dagger.Component;

/**
 * Created By Eslam Ghazy on 11/23/2022
 */

// @Component =>  to tell dagger what do you need to execute from this code
@Component
public interface CarComponent {

    Car getCar();

    // it's necessary to tell dagger where return your callback or to tell dagger where find injection fields
    void inject(MainActivity mainActivity);
}
