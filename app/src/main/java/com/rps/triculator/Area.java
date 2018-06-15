package com.rps.triculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Area extends AppCompatActivity {

    EditText baselength,altitude,area;
    Button calculate,clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        baselength=(EditText) findViewById(R.id.edt_baselength);
        altitude=(EditText) findViewById(R.id.edt_basealtitude);
        area=(EditText) findViewById(R.id.edt_basearea);
        calculate=(Button) findViewById(R.id.btn_calc_area);
        clear=(Button) findViewById(R.id.btn_clear_area);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(baselength.getText().toString().equals("") || altitude.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"ENTER VALID VALUES",Toast.LENGTH_SHORT).show();
                }
                else {
                    int B = Integer.parseInt(baselength.getText().toString());
                    int A = Integer.parseInt(altitude.getText().toString());
                    double result = 1.0 / 2.0 * B * A;

                    area.setText(result + "");
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baselength.setText("");
                altitude.setText("");
                area.setText("");
            }
        });
    }
}
