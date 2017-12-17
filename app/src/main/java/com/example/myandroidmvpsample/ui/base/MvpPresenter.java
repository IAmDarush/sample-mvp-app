package com.example.myandroidmvpsample.ui.base;

/**
 * Created by Darush on 12/12/2017.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
}
