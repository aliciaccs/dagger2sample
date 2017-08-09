package com.amaitacode.dagger2sample;

import android.app.Application;

/**
 * Created by Alicia Maita on 8/9/2017.
 */

public class DaggerSampleApplication  extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
