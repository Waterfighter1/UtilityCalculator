package com.example.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tipButton = (Button) findViewById(R.id.btn_tip);
        Button gasButton = (Button) findViewById(R.id.btn_gas);
        Button taxButton = (Button) findViewById(R.id.btn_tax);

        tipButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, tip.class));
            }
        });

        gasButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, gas.class));
            }
        });

        taxButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, tax.class));
            }
        });
    }
}