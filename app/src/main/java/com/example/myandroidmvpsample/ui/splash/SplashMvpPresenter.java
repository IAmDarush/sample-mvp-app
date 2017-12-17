package com.example.myandroidmvpsample.ui.splash;

import com.example.myandroidmvpsample.ui.base.MvpPresenter;

/**
 * Created by Darush on 12/14/2017.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}
