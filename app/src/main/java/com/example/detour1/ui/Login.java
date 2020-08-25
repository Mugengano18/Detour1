package com.example.detour1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.detour1.Prize1;
import com.example.detour1.R;
import com.example.detour1.SignUp;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.logInButton)
    Button logInButton;
    @BindView(R.id.createAccountTextView)
    TextView createAccountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        logInButton.setOnClickListener(this);
        createAccountTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == logInButton){
            Intent intent = new Intent(Login.this, Prize1.class);
            startActivity(intent);
        }
        if (view == createAccountTextView){
            Intent intent = new Intent(Login.this, SignUp.class);
            startActivity(intent);
        }
    }
}