package com.example.myandroidmvpsample.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsHelper {

    public static final String MY_PREFS = "MY_PREFS";
    public static final String PREF_EMAIL = "PREF_EMAIL";
    public static final String PREF_IS_LOGGED_IN = "PREF_IS_LOGGED_IN";
    private SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email){
        mSharedPreferences.edit().putString(PREF_EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(PREF_EMAIL, null);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean(PREF_IS_LOGGED_IN, false);
    }

    public void setLoggedInMode(boolean loggedInMode) {
        mSharedPreferences.edit().putBoolean(PREF_IS_LOGGED_IN, loggedInMode).apply();
    }
}
