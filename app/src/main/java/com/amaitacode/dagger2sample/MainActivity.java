package com.amaitacode.dagger2sample;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.amaitacode.dagger2sample.model.DiscoverMovieResponse;
import com.amaitacode.dagger2sample.model.Movie;
import com.amaitacode.dagger2sample.service.SingletonService;

import java.io.IOException;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SingletonService singletonService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerSampleApplication) getApplication()).getAppComponent().inject(this);

        (new ArtistTask()).execute();
    }


    private class ArtistTask extends AsyncTask<Void, Void, Movie> {

        @Override
        protected Movie doInBackground(Void... params) {
            try {
                DiscoverMovieResponse resultado = singletonService.getPopularMovies("283a18f26676716d0a92bd8a1c3ac69b");
                if (resultado.getResult().size()>0)
                return resultado.getResult().get(0);
                else return null;
            } catch (IOException e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(Movie result) {
            TextView textView = (TextView) findViewById(R.id.textView2);
            if (result == null) {
                textView.setText("Error");
            } else {
                textView.setText(result.getTitle());
            }
        }

    }

}
