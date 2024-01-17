package com.example.pr_21101_zelentsova_26;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Statistic extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.statistic);
        ImageView backbutton = findViewById(R.id.statbackbtn);
        backbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}