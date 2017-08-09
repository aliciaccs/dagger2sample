package com.amaitacode.dagger2sample.rest;

import com.amaitacode.dagger2sample.rest.MovieRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

@Module
public class RetrofitModule {


    private static final String URL = "https://api.themoviedb.org/3/";

    @Provides
    @Singleton
    MovieRepository providesMovieRepository () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(MovieRepository.class);
    }
}
