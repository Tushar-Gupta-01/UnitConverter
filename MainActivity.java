package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        b=findViewById(R.id.button);
        b.setOnClickListener(v -> {

            Intent i=new Intent(MainActivity.this,Units.class);
            startActivity(i);
            finish();
        });



    }
    @Override
    public void onBackPressed()
    {
        finishAffinity();

    }
}