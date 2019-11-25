package com.ltan.dagger2.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.ltan.dagger2.App;
import com.ltan.dagger2.base.AppComponent;

public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity {
    protected final String TAG = this.getClass().getSimpleName();
    protected App mApplication;
    private Unbinder mUnbinder;
    @Inject
    protected P mPresenter;
    protected Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplication = (App) getApplication();
        mContext = this;

        setContentView(initView());
        mUnbinder = ButterKnife.bind(this);

        setupActivityComponent(mApplication.getAppComponent());
        initData();
    }

    /**
     * 依赖注入的入口
     */
    protected abstract void setupActivityComponent(AppComponent appComponent);


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
        }
        this.mPresenter = null;
        this.mUnbinder = null;
        this.mApplication = null;
    }


    protected abstract View initView();

    protected abstract void initData();


}
