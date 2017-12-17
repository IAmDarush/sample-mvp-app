package com.example.myandroidmvpsample.ui.login;

import com.example.myandroidmvpsample.ui.base.MvpPresenter;

/**
 * Created by Darush on 12/17/2017.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {
    void startLogin(String emailId);
}
