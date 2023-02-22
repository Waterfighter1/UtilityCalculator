package com.example.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);

        Button back = (Button) findViewById(R.id.btn_back);
        Button calcTax = (Button) findViewById(R.id.btn_taxCalc);

        EditText bill = (EditText) findViewById(R.id.etxt_bill);
        EditText rate = (EditText) findViewById(R.id.etxt_rate);

        TextView taxTotal = (TextView) findViewById(R.id.txt_calcText);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(tax.this, MainActivity.class));
            }
        });

        calcTax.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String strBill = bill.getText().toString();
                String strRate = rate.getText().toString();

                Float fl_rate = Float.valueOf(strRate);
                Float fl_bill = Float.valueOf(strBill);

                Float billAfterTax = ((fl_rate / 100) * fl_bill) + fl_bill;

                taxTotal.setText(Float.toString(billAfterTax));
            }
        });
    }
}