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

public class Fifth extends AppCompatActivity {
    EditText e1;
    TextView t;
    Button b1,b2;
    Editable input;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        e1= (EditText)findViewById(R.id.edittext3);
        t=(TextView) findViewById(R.id.textView8);
        b1=(Button) findViewById(R.id.button7);
        b2=(Button) findViewById(R.id.button8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input=e1.getText();
                float a= Integer.parseInt(String.valueOf(e1.getText()));
                t.setText(input+"centimeter is equal to "+a*0.0328084+"Feet");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Fifth.this,Units.class);
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