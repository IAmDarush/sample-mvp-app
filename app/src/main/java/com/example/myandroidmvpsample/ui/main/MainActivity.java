package com.example.myandroidmvpsample.ui.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myandroidmvpsample.MvpApp;
import com.example.myandroidmvpsample.R;
import com.example.myandroidmvpsample.data.DataManager;
import com.example.myandroidmvpsample.ui.base.BaseActivity;
import com.example.myandroidmvpsample.ui.splash.SplashActivity;

public class MainActivity extends BaseActivity implements MainMvpVIew {

    TextView tvShow;
    Button btnLogout;
    MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);

        tvShow = findViewById(R.id.tv_main_show);
        btnLogout = findViewById(R.id.btn_main_logout);

        tvShow.setText(mainPresenter.getEmailId());

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.setUserLoggedOut();
            }
        });


    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
