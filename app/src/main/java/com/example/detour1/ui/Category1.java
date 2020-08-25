package com.example.detour1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.detour1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Category1 extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.arch1)
    TextView arch100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category1);
        ButterKnife.bind(this);
        arch100.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == arch100){
            Intent intent = new Intent(Category1.this,Level1.class);
            startActivity(intent);
        }
    }
}