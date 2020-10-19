package com.example.escape2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Studycenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studycenter);

        Button button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent5 = new Intent(Studycenter.this, floor4.class);
                startActivity(myintent5);
            }
        });

        Button button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent6 = new Intent(Studycenter.this, floor3.class);
                startActivity(myintent6);
            }
        });

        Button button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent7 = new Intent(Studycenter.this, floor2.class);
                startActivity(myintent7);
            }
        });
    }
}