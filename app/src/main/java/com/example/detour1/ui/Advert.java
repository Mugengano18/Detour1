package com.example.detour1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.detour1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Advert extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.cancel)
    ImageView cancelImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advert);
        ButterKnife.bind(this);
        cancelImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == cancelImg){
            Intent intent = new Intent(Advert.this,Category1.class);
            startActivity(intent);
        }
    }
}