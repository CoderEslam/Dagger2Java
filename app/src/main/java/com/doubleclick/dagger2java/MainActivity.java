package com.doubleclick.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.doubleclick.dagger2java.dagger.Car;
import com.doubleclick.dagger2java.dagger.CarComponent;
import com.doubleclick.dagger2java.dagger.DaggerCarComponent;
import com.doubleclick.dagger2java.dagger.Engine;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car carInjection; // Dagger does not support injection into private fields

    @Inject // it's make for you an instance by generation and define it from generation
    Engine engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Wheels wheels = new Wheels(2, 6);
        Engine engine = new Engine("e1", "e2");

        car = new Car(engine, wheels);

        car.drive();*/

        CarComponent component = DaggerCarComponent.create();
        component.inject(this); // nessassry to tell dagger where return your callback
//        car = component.getCar();

        carInjection.drive();
        component.getEngine();
    }
}