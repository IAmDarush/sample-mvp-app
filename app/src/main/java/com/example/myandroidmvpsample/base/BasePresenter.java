package com.example.myandroidmvpsample.base;

import com.example.myandroidmvpsample.data.DataManager;

/**
 * Created by Darush on 12/12/2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;
    private DataManager mDataManager;

    public BasePresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDatamanager() {
        return mDataManager;
    }

}
