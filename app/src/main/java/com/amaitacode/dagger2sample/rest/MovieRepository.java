package com.amaitacode.dagger2sample.rest;

import com.amaitacode.dagger2sample.model.DiscoverMovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

public interface MovieRepository {

    @GET ("/discover/movie?sort_by=popularity.desc&language=es-VE")
    Call<DiscoverMovieResponse> getPopularMovies(@Path("mkey") String mkey);
}
