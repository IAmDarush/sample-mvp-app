package com.example.myandroidmvpsample.ui.main;

import com.example.myandroidmvpsample.ui.base.MvpPresenter;

/**
 * Created by Darush on 12/18/2017.
 */

public interface MainMvpPresenter<V extends MainMvpVIew> extends MvpPresenter<V> {
    String getEmailId();
    void setUserLoggedOut();
}
