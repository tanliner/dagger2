package com.ltan.dagger2.ui.login;

import javax.inject.Inject;

import com.ltan.dagger2.base.mvp.BasePresenter;
import com.ltan.dagger2.base.scope.ActivityScope;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by Administrator on 2017/1/3.
 */
@ActivityScope
public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.View> implements LoginContract.Presenter {

    @Inject
    LoginPresenter() {
    }


    /**
     * 登录
     */
    @Override
    public void login(final String mobile, final String password) {
        mModel.login(mobile, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(String s) {
                        mView.loginSuccess(s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void onDestroy() {

    }


}
