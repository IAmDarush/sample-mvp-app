package com.example.myandroidmvpsample.ui.splash;

import com.example.myandroidmvpsample.base.BasePresenter;
import com.example.myandroidmvpsample.data.DataManager;

/**
 * Created by Darush on 12/14/2017.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDatamanager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}
