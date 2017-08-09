package com.amaitacode.dagger2sample;

import com.amaitacode.dagger2sample.rest.RetrofitModule;
import com.amaitacode.dagger2sample.service.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

    @Singleton
    @Component(modules = {AppModule.class,
            ServiceModule.class,
            RetrofitModule.class})
    public interface AppComponent {
        void inject (MainActivity activity);

            }

