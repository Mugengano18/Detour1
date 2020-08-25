package com.example.detour1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.detour1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Prize1 extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.cancel)
    ImageView mCancelImg;
    @BindView(R.id.relativeLayoutPlay)
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prize1);
        ButterKnife.bind(this);
        mCancelImg.setOnClickListener(this);
        relativeLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mCancelImg){
            Intent intent = new Intent(Prize1.this,Category1.class);
            startActivity(intent);
        }
        if (view == relativeLayout){
            Intent intent = new Intent(Prize1.this,Category1.class);
            startActivity(intent);
        }
    }
}