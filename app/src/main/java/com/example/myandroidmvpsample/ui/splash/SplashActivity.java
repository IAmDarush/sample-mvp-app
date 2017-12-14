package com.example.myandroidmvpsample.ui.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myandroidmvpsample.R;
import com.example.myandroidmvpsample.base.BaseActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void openMainActivity() {

    }

    @Override
    public void openLoginActivity() {

    }
}
