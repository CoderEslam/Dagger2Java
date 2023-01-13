package com.doubleclick.dagger2java.dagger;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created By Eslam Ghazy on 1/13/2023
 */
// I do it when I want do inject class interface => use @Binds with abstract
@Module
public class EngineModule {

    private int horsePower;

    public EngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

//    @Binds
//    abstract Engine bindPetrol(PetrolEngine petrolEngine);

    @Provides
    Engine providePetrol() {
        return new PetrolEngine(horsePower);
    }

}
