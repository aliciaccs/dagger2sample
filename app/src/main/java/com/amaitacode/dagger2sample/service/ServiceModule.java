package com.amaitacode.dagger2sample.service;

import android.content.Context;

import com.amaitacode.dagger2sample.rest.MovieRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

@Module
public class ServiceModule {

    @Provides
    @Singleton
    SingletonService providesRetrofitSingletonService (MovieRepository movieRepository, Context context) {
        return new RetrofitSingletonService(movieRepository,context);
    }
}
