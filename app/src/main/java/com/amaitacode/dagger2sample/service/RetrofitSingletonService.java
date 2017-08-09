package com.amaitacode.dagger2sample.service;

import android.content.Context;

import com.amaitacode.dagger2sample.model.DiscoverMovieResponse;
import com.amaitacode.dagger2sample.rest.MovieRepository;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Alicia Maita on 8/9/2017.
 */
@Singleton
public class RetrofitSingletonService implements SingletonService {

    private final MovieRepository movieRepository;
    private final Context context;

    @Inject
    public RetrofitSingletonService (MovieRepository movieRepository, Context context) {
        this.movieRepository= movieRepository;
        this.context = context;
    }


    @Override
    public DiscoverMovieResponse getPopularMovies(String mkey) throws IOException {
        return movieRepository.getPopularMovies(mkey).execute().body();
    }
}
