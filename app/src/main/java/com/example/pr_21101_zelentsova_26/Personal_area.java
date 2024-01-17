package com.example.pr_21101_zelentsova_26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Personal_area extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(this);
        Button allorders = findViewById(R.id.ordersbtn);
        allorders.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.backbutton) {
            this.finish();
        }
        else if (id == R.id.ordersbtn) {
            startActivity(new Intent(this, Statistic.class));
        }

    }
}