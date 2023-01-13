package com.doubleclick.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.doubleclick.dagger2java.dagger.Car;
import com.doubleclick.dagger2java.dagger.CarComponent;
import com.doubleclick.dagger2java.dagger.DaggerCarComponent;
import com.doubleclick.dagger2java.dagger.EngineModule;
import com.doubleclick.dagger2java.dagger.WheelsModule;


import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car; // Dagger does not support injection into private fields

//    @Inject // it's make for you an instance by generation and define it from generation
//    Engine engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent
                .builder()
                .engineModule(new EngineModule(10))
                .wheelsModule(new WheelsModule(21))
                .build();
        // when I call @Inject in any activity I have to inject Activity as params with dagger
        // it's necessary to tell dagger where return your callback or to tell dagger where find injection fields
        component.inject(this);
//        car = component.getCar();

        car.drive();
    }
}