package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Third extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    TextView t ;
    Editable input;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        e1= (EditText)findViewById(R.id.edittext1);
        t=(TextView) findViewById(R.id.textView4);
        b1=(Button) findViewById(R.id.button3);
        b2=(Button) findViewById(R.id.button4);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input=e1.getText();
                float a= Integer.parseInt(String.valueOf(e1.getText()));
                t.setText(input+"km is equal to "+a*1000+"meter");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Third.this,Units.class);
                startActivity(i3);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
    }

}