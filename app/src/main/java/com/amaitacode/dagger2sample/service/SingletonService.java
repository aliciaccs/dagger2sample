package com.amaitacode.dagger2sample.service;

import com.amaitacode.dagger2sample.model.DiscoverMovieResponse;

import java.io.IOException;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

public interface SingletonService {

    DiscoverMovieResponse getPopularMovies(String mkey) throws IOException;
}
