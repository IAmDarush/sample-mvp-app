package com.example.myandroidmvpsample.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.myandroidmvpsample.MvpApp;
import com.example.myandroidmvpsample.R;
import com.example.myandroidmvpsample.data.DataManager;
import com.example.myandroidmvpsample.ui.base.BaseActivity;
import com.example.myandroidmvpsample.ui.login.LoginActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mSplashPresenter = new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent intent = getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
