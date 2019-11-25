package com.ltan.dagger2.base;

import android.app.Application;

import com.google.gson.Gson;
import com.ltan.dagger2.base.module.ApiServiceModule;
import com.ltan.dagger2.base.module.AppModule;
import com.ltan.dagger2.base.module.HttpModule;
import com.ltan.dagger2.manager.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/1/3.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class})
public interface AppComponent {

    Application application();

    ServiceManager serviceManager();

    Gson gson();

}
