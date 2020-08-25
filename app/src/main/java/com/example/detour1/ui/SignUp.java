package com.example.detour1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.detour1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.createAccountButton)
    Button createAccountButton;
    @BindView(R.id.loginTextView)
    TextView loginTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        createAccountButton.setOnClickListener(this);
        loginTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == createAccountButton){
            Intent intent = new Intent(SignUp.this,onboarding.class);
            startActivity(intent);
        }
        if (view == loginTextView){
            Intent intent = new Intent(SignUp.this,Login.class);
            startActivity(intent);
        }
    }
}