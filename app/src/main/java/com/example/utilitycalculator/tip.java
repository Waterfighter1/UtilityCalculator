package com.example.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        Button calculateTip = (Button) findViewById(R.id.btn_tip_calc);
        Button back = (Button) findViewById(R.id.btn_back);
        TextView tipTotal = (TextView) findViewById(R.id.txt_tip_total);
        EditText originalBill = (EditText) findViewById(R.id.etxt_bill);
        RadioGroup tip_group = (RadioGroup) findViewById(R.id.rag_tip_amt);
        RadioButton tip10 = (RadioButton) findViewById(R.id.tip_10);
        RadioButton tip15 = (RadioButton) findViewById(R.id.tip_15);

        calculateTip.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(tip_group.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please Select Tip Amount", Toast.LENGTH_SHORT).show();
                }
                else {
                    String strOriginalBill = originalBill.getText().toString();
                    double intOriginalBill = Double.parseDouble(strOriginalBill);
                    double rate = 1.0;
                    if(tip10.isChecked()){
                        rate = .1;
                    }
                    else if (tip15.isChecked()) {
                        rate = .15;
                    }
                    else {
                        rate = .2;
                    }
                    double finalBill = intOriginalBill * rate;

                    tipTotal.setText(Double.toString(finalBill));
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(tip.this, MainActivity.class));
            }
        });
    }
}