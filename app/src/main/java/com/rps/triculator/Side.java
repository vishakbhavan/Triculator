package com.rps.triculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Side extends AppCompatActivity {
    EditText baselength,altitude,hypotenuse;
    Button calculate,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side);

        baselength=(EditText) findViewById(R.id.edt_base_side);
        altitude=(EditText) findViewById(R.id.edt_altitude_side);
        hypotenuse=(EditText) findViewById(R.id.edt_hypotenuse_side);
        calculate=(Button) findViewById(R.id.btn_calc_side);
        clear=(Button) findViewById(R.id.btn_clear_side);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                double A=0, H=0, B=0 ;
                double res=0.0;



                if(!altitude.getText().toString().trim().isEmpty()) {
                    A=Double.parseDouble(altitude.getText().toString());
                }
                if(!baselength.getText().toString().trim().equals("")) {
                    B=Double.parseDouble(baselength.getText().toString());
                }
                if(!hypotenuse.getText().toString().trim().equals(""))
                {
                    H=Double.parseDouble(hypotenuse.getText().toString());
                }
                if(!altitude.getText().toString().trim().equals("") && A>0 && !
                        baselength.getText().toString().trim().equals("") && B>0) {
                    res=Math.sqrt((A*A+ B*B));
                    hypotenuse.setText(""+res);
                } else if(!altitude.getText().toString().trim().equals("") && A>0 && !hypotenuse.getText().toString().trim().equals("") && H>0) {
                    res=Math.sqrt((H*H - A*A));
                    baselength.setText(""+res);
                } else if(!hypotenuse.getText().toString().trim().equals("") && H>0 && !baselength.getText().toString().trim().equals("") && B>0) {
                    res=Math.sqrt((H*H - B*B));
                    altitude.setText(""+res);
                }
                else
                {
                    Toast.makeText(Side.this, "ENTER ANY TWO VALUES GREATER THAN ZERO", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                baselength.setText("");
                altitude.setText("");
                hypotenuse.setText("");
            }
        });

    }
}
