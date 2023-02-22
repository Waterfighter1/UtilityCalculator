package com.example.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas);

        Button back = (Button) findViewById(R.id.btn_back);
        Button calcGas = (Button) findViewById(R.id.btn_calcGas);
        EditText gasTank = (EditText) findViewById(R.id.etxt_gasTank);
        EditText gasDist = (EditText) findViewById(R.id.etxt_dist);
        TextView gasMPG = (TextView) findViewById(R.id.txt_mpg);

        calcGas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str_gasTank = gasTank.getText().toString();
                String str_gasDist = gasDist.getText().toString();

                Float fl_gasTank = Float.valueOf(str_gasTank);
                Float fl_gasDist = Float.valueOf(str_gasDist);

                Float mpg = fl_gasDist / fl_gasTank  ;

                gasMPG.setText(Float.toString(mpg));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(gas.this, MainActivity.class));
            }
        });
    }
}