package com.example.myandroidmvpsample;

import android.app.Application;

import com.example.myandroidmvpsample.data.DataManager;
import com.example.myandroidmvpsample.data.SharedPrefsHelper;

/**
 * Created by Darush on 12/17/2017.
 */

public class MvpApp extends Application{

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
