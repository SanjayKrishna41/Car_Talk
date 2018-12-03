package com.codeproofs.cartalk;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {

    EditText userName,password,email;
    Spinner terms;
    String name,pass,emailId,termConditions;
    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}
