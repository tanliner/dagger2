package com.ltan.dagger2.ui.login.inject;

import com.ltan.dagger2.base.scope.ActivityScope;
import com.ltan.dagger2.ui.login.LoginContract;
import com.ltan.dagger2.ui.login.LoginModel;

import com.ltan.dagger2.ui.login.LoginPresenter;
import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {
    private LoginContract.View view;

    public LoginModule(LoginContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    LoginContract.Model provideModel(LoginModel model) {
        return model;
    }

    @ActivityScope
    @Provides
    LoginContract.View provideView() {
        return this.view;
    }


    @ActivityScope
    @Provides
    LoginContract.Presenter providePresenter(LoginPresenter presenter) {
        return presenter;
    }
}
