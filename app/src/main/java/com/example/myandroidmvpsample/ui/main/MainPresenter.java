package com.example.myandroidmvpsample.ui.main;

import com.example.myandroidmvpsample.data.DataManager;
import com.example.myandroidmvpsample.ui.base.BasePresenter;

/**
 * Created by Darush on 12/18/2017.
 */

public class MainPresenter<V extends MainMvpVIew> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDatamanager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDatamanager().clear();
        getMvpView().openSplashActivity();
    }
}
