package com.example.pr_21101_zelentsova_26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class Statistic extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.statistic);
        ImageView backbutton = findViewById(R.id.statbackbtn);
        backbutton.setOnClickListener(this);

        Button towebbtn = findViewById(R.id.towebbtn);
        towebbtn.setOnClickListener(this);

        CheckBox cb = (CheckBox) findViewById(R.id.checkboxgetted);
        cb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.statbackbtn) {
            this.finish();
        }
        else if (v.getId() == R.id.towebbtn) {
            startActivity(
                    new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://taxi.yandex.ru")
                    )
            );
        }

        else if (v.getId() == R.id.checkboxgetted) {
            Button web = findViewById(R.id.towebbtn);
            web.setBackgroundColor(Color.BLACK);
        }
    }
}