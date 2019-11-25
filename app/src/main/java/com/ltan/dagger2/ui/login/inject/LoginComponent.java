package com.ltan.dagger2.ui.login.inject;

import com.ltan.dagger2.base.AppComponent;
import com.ltan.dagger2.base.scope.ActivityScope;
import com.ltan.dagger2.ui.login.LoginActivity;
import dagger.Component;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity activity);

}
