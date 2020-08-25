package com.example.detour1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import com.example.detour1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Level1 extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.layoutDjoser)
    LinearLayout layoutDjoser;
    @BindView(R.id.clueArch100)
    LinearLayout clueArch100;
    @BindView(R.id.passLayout)
    LinearLayout passLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        ButterKnife.bind(this);
        layoutDjoser.setOnClickListener(this);
        clueArch100.setOnClickListener(this);
        passLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == layoutDjoser){
            Intent intent = new Intent(Level1.this, Advert.class);
            startActivity(intent);
        }
        if (view == clueArch100){
            Intent intent = new Intent(Level1.this, Clue.class);
            startActivity(intent);
        }
        if (view == passLayout){
            Intent intent = new Intent(Level1.this, Category1.class);
            startActivity(intent);
        }
    }
}