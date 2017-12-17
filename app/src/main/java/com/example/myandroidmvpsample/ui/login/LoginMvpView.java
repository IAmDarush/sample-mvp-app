package com.example.myandroidmvpsample.ui.login;

import com.example.myandroidmvpsample.ui.base.MvpView;

/**
 * Created by Darush on 12/16/2017.
 */

public interface LoginMvpView extends MvpView {
    void openMainActivity();
    void onLoginButtonClick();
}
