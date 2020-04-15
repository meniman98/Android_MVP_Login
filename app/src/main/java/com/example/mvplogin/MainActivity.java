package com.example.mvplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvplogin.contract.MainContract;
import com.example.mvplogin.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private EditText username, password;
    private Button login;
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);

        presenter = new PresenterImpl(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.AttemptLoginUser(username.getText().toString(),
                        password.getText().toString());
            }
        });



    }

    @Override
    public void showError() {
        Toast.makeText(this, "Failed login attempt", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void LoginUser() {
        Toast.makeText(this, "You logged in", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();

    }
}
