package com.example.myandroidmvpsample.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myandroidmvpsample.MvpApp;
import com.example.myandroidmvpsample.R;
import com.example.myandroidmvpsample.ui.base.BaseActivity;
import com.example.myandroidmvpsample.data.DataManager;
import com.example.myandroidmvpsample.ui.main.MainActivity;
import com.example.myandroidmvpsample.utils.CommonUtils;

public class LoginActivity extends BaseActivity implements LoginMvpView {

    LoginPresenter loginPresenter;
    EditText etEmail;
    EditText etPassword;
    Button btnLogin;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        loginPresenter = new LoginPresenter(dataManager);

        loginPresenter.onAttach(this);
        etEmail = findViewById(R.id.et_login_email);
        etPassword = findViewById(R.id.et_login_password);
        btnLogin = findViewById(R.id.btn_login_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginButtonClick();
            }
        });

    }

    @Override
    public void openMainActivity() {
        Intent intent = getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {

        String emailId = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

        loginPresenter.startLogin(emailId);
    }

}
