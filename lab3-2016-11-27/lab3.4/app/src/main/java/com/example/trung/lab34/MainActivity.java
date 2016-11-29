package com.example.trung.lab34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    TextView tvCreate;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getReferences();
        setUI();
    }

    private void setUI() {
        tvCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResignActivity.class);
                startActivity(intent);

            }
        });

    }

    private void getReferences() {
        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        tvCreate = (TextView) findViewById(R.id.tv_create);
        btLogin = (Button) findViewById(R.id.bt_login);
    }

}
