package com.rps.triculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Area extends AppCompatActivity {

    EditText baselength, altitude, area;
    Button calculate, clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        baselength = (EditText) findViewById(R.id.edt_baselength);
        altitude = (EditText) findViewById(R.id.edt_basealtitude);
        area = (EditText) findViewById(R.id.edt_basearea);

        calculate = (Button) findViewById(R.id.btn_calc_area);
        clear = (Button) findViewById(R.id.btn_clear_area);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String BASE = baselength.getText().toString();
                final String ALTITUDE = altitude.getText().toString();
                if (BASE.isEmpty()) {
                    baselength.requestFocus();
                    baselength.setError("BASE CANNOT BE EMPTY");
                } else if (Double.parseDouble(BASE) <= 0) {
                    baselength.requestFocus();
                    baselength.setError("BASE SHOULD BE GREATER THAN ZERO");

                } else if (ALTITUDE.isEmpty()) {
                    baselength.setError(null);
                    altitude.requestFocus();
                    altitude.setError("ALTITUDE CANNOT BE EMPTY");

                } else if (Double.parseDouble(ALTITUDE) <= 0)
                {
                    altitude.requestFocus();
                    altitude.setError("ALTITUDE SHOULD BE GREATER THAN ZERO");
                } else {
                    double B = Double.parseDouble(BASE.trim());
                    double A = Double.parseDouble(ALTITUDE.trim());
                    double result = 1.0 / 2.0 * B * A;

                    area.setText(Double.toString(result));
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
