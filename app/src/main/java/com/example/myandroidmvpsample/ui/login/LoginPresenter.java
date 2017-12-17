package com.example.myandroidmvpsample.ui.login;

import com.example.myandroidmvpsample.ui.base.BasePresenter;
import com.example.myandroidmvpsample.data.DataManager;

/**
 * Created by Darush on 12/17/2017.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V>{

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }


    @Override
    public void startLogin(String emailId) {
        getDatamanager().saveEmailId(emailId);
        getDatamanager().setLoggedIn();
        getMvpView().openMainActivity();
    }
}
