package com.ltan.dagger2;

import android.app.Application;


import com.ltan.dagger2.base.AppComponent;
import com.ltan.dagger2.base.DaggerAppComponent;
import com.ltan.dagger2.base.module.ApiServiceModule;
import com.ltan.dagger2.base.module.AppModule;
import com.ltan.dagger2.base.module.HttpModule;

/**
 * Created by Administrator on 2017/1/3.
 */
public class App extends Application{

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .httpModule(new HttpModule())
                .build();
    }


    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
