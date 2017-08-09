package com.amaitacode.dagger2sample;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alicia Maita on 8/9/2017.
 */
@Module
public class AppModule {

    private Context context;

    public AppModule (Context context) {
        this.context = context;
    }


    @Provides
    @Singleton
    Context providesContext() {
        return context;
    }
}
