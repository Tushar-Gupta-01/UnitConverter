package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Units extends AppCompatActivity {
    ImageView i1,i2,i3,i4;
    TextView t1,t2,t3,t4,t5;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
        t1=(TextView) findViewById(R.id.textView3);
        t2=(TextView) findViewById(R.id.textView5);
        t3=(TextView) findViewById(R.id.textView6);
        t4=(TextView) findViewById(R.id.textView7);
        t5=(TextView)findViewById(R.id.textView12);
        b=(Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Units.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Units.this,Third.class);
                startActivity(intent1);
                finish();

            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Units.this,Fourth.class);
                startActivity(intent2);
                finish();

            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Units.this,Fifth.class);
                startActivity(intent3);
                finish();

            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Units.this,Sixth.class);
                startActivity(intent4);
                finish();

            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Units.this,Seventh.class);
                startActivity(intent5);
                finish();

            }
        });


    }
    @Override
    public void onBackPressed()
    {
        finishAffinity();

    }
}