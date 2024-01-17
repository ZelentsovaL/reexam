package com.example.pr_21101_zelentsova_26;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.Value;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText login;
    String logintext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.login_edittext);
        logintext = login.getText().toString();
    }

/*
    private String getData() {

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference docRef = db.collection("users").document(logintext);
        DocumentSnapshot doc = docRef.get();
        String name = doc.getString("name");
        return name;
    }
*/

    @Override
    public void onClick(View v) {

//        String login = getData();

        Intent intent = new Intent(this, Personal_area.class);
//        intent.putExtra("name", login);
        startActivity(intent);
    }
}