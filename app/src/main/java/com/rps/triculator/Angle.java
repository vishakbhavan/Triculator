package com.rps.triculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Angle extends AppCompatActivity {

    EditText baselength, altitude, hypotenuse, ang_a, ang_b, ang_c;
    Button calculate, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);

        baselength = (EditText) findViewById(R.id.edt_base_angle);
        altitude = (EditText) findViewById(R.id.edt_altitude_angle);
        hypotenuse = (EditText) findViewById(R.id.edt_hypotenuse_angle);

        ang_a = (EditText) findViewById(R.id.res_angle_a);
        ang_b = (EditText) findViewById(R.id.res_angle_b);
        ang_c = (EditText) findViewById(R.id.res_angle_c);


        calculate = (Button) findViewById(R.id.btn_calc_angle);
        clear = (Button) findViewById(R.id.btn_clear_angle);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //here
                if (altitude.getText().toString().isEmpty())
                {
                    altitude.requestFocus();
                    altitude.setError("ALTITUDE CANNOT BE EMPTY");
                }
                else if (Double.parseDouble(altitude.getText().toString()) <= 0)
                {
                    altitude.requestFocus();
                    altitude.setError("ALTITUDE SHOULD BE GREATER THAN ZERO");
                }
                else if (baselength.getText().toString().isEmpty())
                {
                    altitude.setError(null);
                    baselength.requestFocus();
                    baselength.setError("BASE CANNOT BE EMPTY");

                }
                else if (Double.parseDouble(baselength.getText().toString()) <= 0)
                {
                    baselength.requestFocus();
                    baselength.setError("BASE SHOULD BE GREATER THAN ZERO");
                }
                else
                {
                    double A=0, B=0, H=0;
                    double AngleA=0.0,AngleB=0.0,AngleC=0.0;

                    A = Double.parseDouble(altitude.getText().toString().trim());
                    B = Double.parseDouble(baselength.getText().toString().trim());

                    H = Math.sqrt((A * A) + (B * B));
                    hypotenuse.setText(Double.toString(H));

                    double angle=Math.atan(A/B);
                    AngleA=Math.toDegrees(angle);
                    AngleC=90-AngleA;

                    ang_a.setText(Double.toString(AngleA));
                    ang_c.setText(Double.toString(AngleC));


                }
                //here
            }


    });


        clear.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        baselength.setText("");
        altitude.setText("");
        hypotenuse.setText("");
        ang_a.setText("");
        /*ang_b.setText("");*/
        ang_c.setText("");
    }
    });
}
}
