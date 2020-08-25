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

public class Clue extends AppCompatActivity implements View.OnClickListener {
//    @BindView(R.id.cancel)
//    ImageView cancelImg;
//    @BindView(R.id.relativeLayout)
//    RelativeLayout relativeLayoutPlay;
    private ImageView cancelImg;
    private RelativeLayout relativeLayoutPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);
//        ButterKnife.bind(this);
        cancelImg = (ImageView) findViewById(R.id.cancel);
        relativeLayoutPlay =(RelativeLayout) findViewById(R.id.relativeLayoutPlay);
        cancelImg.setOnClickListener(this);
        relativeLayoutPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == cancelImg){
            Intent intent = new Intent(Clue.this,Level1.class);
            startActivity(intent);
        }
        if (view == relativeLayoutPlay) {
            Intent intent = new Intent(Clue.this,Level1.class);
            startActivity(intent);
        }
    }
}