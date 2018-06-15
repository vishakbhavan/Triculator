package com.rps.triculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Angle extends AppCompatActivity {

    EditText baselength,altitude,hypotenuse,ang_a,ang_b,ang_c;
    Button calculate,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);

        baselength=(EditText) findViewById(R.id.edt_base_angle);
        altitude=(EditText) findViewById(R.id.edt_altitude_angle);
        hypotenuse=(EditText) findViewById(R.id.edt_hypotenuse_angle);

        ang_a=(EditText) findViewById(R.id.res_angle_a);
        ang_b=(EditText) findViewById(R.id.res_angle_b);
        ang_c=(EditText) findViewById(R.id.res_angle_c);

        calculate=(Button) findViewById(R.id.btn_calc_angle);
        clear=(Button) findViewById(R.id.btn_clear_angle);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //here

                double A, B, H;
                A= Double.parseDouble(altitude.getText().toString());
                H=Double.parseDouble(hypotenuse.getText().toString());
                double angleC=0.0, angleA=0.0, angleB=90;
                double sin1=(A/H);
                System.out.println(""+sin1);
                if(sin1>=0.0&&sin1<0.0174) {
                    angleC=0.0;
                } else if(sin1>=0.0174&&sin1<0.0349) {
                    angleC= 1.0;
                } else if(sin1>=0.0349&&sin1<0.0523) {
                    angleC= 2.0;
                } else if(sin1>=0.0523&&sin1<0.0698) {
                    angleC= 3.0;
                }

                else if(sin1>=0.0698&&sin1<0.0872) {
                    angleC= 4.0;
                } else if(sin1>=0.0872&&sin1<0.1045) {
                    angleC= 5.0;
                } else if(sin1>=0.1045&&sin1<0.1219) {
                    angleC=6.0;
                } else if(sin1>=0.1219&&sin1<0.1392) {
                    angleC=7.0;
                } else if(sin1>=0.1392&&sin1<0.1564) {
                    angleC=8.0;
                } else if(sin1>=0.1564&&sin1<0.1736) {
                    angleC=9.0;
                }

                else if(sin1>=0.1736&&sin1<0.1908) {
                    angleC=10.0;
                } else if(sin1>=0.1908&&sin1<0.2079) {
                    angleC=11.0;
                } else if(sin1>=0.2079&&sin1<0.2249) {
                    angleC=12.0;
                } else if(sin1>=0.2249&&sin1<0.2419) {
                    angleC=13.0;
                } else if(sin1>=0.2419&&sin1<0.2588) {
                    angleC=14.0;
                } else if(sin1>=0.2588&&sin1<0.2756) {
                    angleC=15.0;
                }

                else if(sin1>=0.2756&&sin1<0.2924) {
                    angleC=16.0;
                } else if(sin1>=0.2924&&sin1<0.3090) {
                    angleC=17.0;
                } else if(sin1>=0.3090&&sin1<0.3256) {
                    angleC=18.0;
                } else if(sin1>=0.3256&&sin1<0.3420) {
                    angleC=19.0;
                } else if(sin1>=0.3420&&sin1<0.3584) {
                    angleC=20.0;
                } else if(sin1>=0.3584&&sin1<0.3746) {
                    angleC=21.0;
                }

                else if(sin1>=0.3746&&sin1<0.3907) {
                    angleC=22.0;
                } else if(sin1>=0.3907&&sin1<0.4067) {
                    angleC=23.0;
                } else if(sin1>=0.4067&&sin1<0.4226) {
                    angleC=24.0;
                } else if(sin1>=0.4226&&sin1<0.4384) {
                    angleC=25.0;
                } else if(sin1>=0.4384&&sin1<0.4540) {
                    angleC=26.0;
                } else if(sin1>=0.4540&&sin1<0.4696) {
                    angleC=27.0;
                }

                else if(sin1>=0.4696&&sin1<0.4848) {
                    angleC=28.0;
                } else if(sin1>=0.4848&&sin1<0.5000) {
                    angleC=29.0;
                } else if(sin1>=0.5000&&sin1<0.5150) {
                    angleC=30.0;
                } else if(sin1>=0.5150&&sin1<0.5299) {
                    angleC=31.0;
                } else if(sin1>=0.5299&&sin1<0.5446) {
                    angleC=32.0;
                } else if(sin1>=0.5446&&sin1<0.5592) {
                    angleC=33.0;
                }

                else if(sin1>=0.5592&&sin1<0.5736) {
                    angleC=34.0;
                } else if(sin1>=0.5736&&sin1<0.5878) {
                    angleC=35.0;
                } else if(sin1>=0.5878&&sin1<0.6018) {
                    angleC=36.0;
                } else if(sin1>=0.6018&&sin1<0.6157) {
                    angleC=37.0;
                } else if(sin1>=0.6157&&sin1<0.6293) {
                    angleC=38.0;
                } else if(sin1>=0.6293&&sin1<0.6428) {
                    angleC=39.0;
                }

                else if(sin1>=0.6428&&sin1<0.6561) {
                    angleC=40.0;
                } else if(sin1>=0.6561&&sin1<0.6691) {
                    angleC=41.0;
                } else if(sin1>=0.6691&&sin1<0.6820) {
                    angleC=42.0;
                } else if(sin1>=0.6820&&sin1<0.6947) {
                    angleC=43.0;
                } else if(sin1>=0.6947&&sin1<0.7071) {
                    angleC=44.0;
                } else if(sin1>=0.7071&&sin1<0.7193) {
                    angleC=45.0;
                }

                else if(sin1>=0.7193&&sin1<0.7314) {
                    angleC=46.0;
                } else if(sin1>=0.7314&&sin1<0.7431) {
                    angleC=47.0;
                } else if(sin1>=0.7431&&sin1<0.7547) {
                    angleC=48.0;
                } else if(sin1>=0.7547&&sin1<0.7660) {
                    angleC=49.0;
                } else if(sin1>=0.7660&&sin1<0.7772) {
                    angleC=50.0;
                } else if(sin1>=0.7772&&sin1<0.7880) {
                    angleC=51.0;
                } else if(sin1>=0.&&sin1<0.7986) {
                    angleC=52.0;
                } else if(sin1>=0.7986&&sin1<0.8090) {
                    angleC=53.0;
                } else if(sin1>=0.8090&&sin1<0.8191) {
                    angleC=54.0;
                } else if(sin1>=0.8191&&sin1<0.8290) {
                    angleC=55.0;
                } else if(sin1>=0.8290&&sin1<0.8387) {
                    angleC=56.0;
                } else if(sin1>=0.8387&&sin1<0.8480) {
                    angleC=57.0;
                } else if(sin1>=0.8480&&sin1<0.8571) {
                    angleC=58.0;
                }

                else if(sin1>=0.8571&&sin1<0.8660) {
                    angleC=59.0;
                } else if(sin1>=0.8660&&sin1<0.8746) {
                    angleC=60.0;
                } else if(sin1>=0.8746&&sin1<0.8829) {
                    angleC=61.0;
                } else if(sin1>=0.8829&&sin1<0.8910) {
                    angleC=62.0;
                } else if(sin1>=0.8910&&sin1<0.8988) {
                    angleC=63.0;
                } else if(sin1>=0.8988&&sin1<0.9063) {
                    angleC=64.0;
                } else if(sin1>=0.9063&&sin1<0.9135) {
                    angleC=65.0;
                } else if(sin1>=0.9135&&sin1<0.9205) {
                    angleC=66.0;
                } else if(sin1>=0.9205&&sin1<0.9272) {
                    angleC=67.0;
                }

                else if(sin1>=0.9272&&sin1<0.9336) {
                    angleC=68.0;
                } else if(sin1>=0.9336&&sin1<0.9397) {
                    angleC=69.0;
                } else if(sin1>=0.9397&&sin1<0.9455) {
                    angleC=70.0;
                } else if(sin1>=0.9455&&sin1<0.9511) {
                    angleC=71.0;
                } else if(sin1>=0.9511&&sin1<0.9563) {
                    angleC=72.0;
                } else if(sin1>=0.9563&&sin1<0.9613) {
                    angleC=73.0;
                } else if(sin1>=0.9613&&sin1<0.9659) {
                    angleC=74.0;
                } else if(sin1>=0.9659&&sin1<0.9703) {
                    angleC=75.0;
                } else if(sin1>=0.9703&&sin1<0.9744) {
                    angleC=76.0;
                } else if(sin1>=0.9744&&sin1<0.9781) {
                    angleC=77.0;
                } else if(sin1>=0.9781&&sin1<0.9816) {
                    angleC=78.0;
                }

                else if(sin1>=0.9816&&sin1<0.9848) {
                    angleC=79.0;
                } else if(sin1>=0.9848&&sin1<0.9877) {
                    angleC=80.0;
                } else if(sin1>=0.9877&&sin1<0.9903) {
                    angleC=81.0;
                } else if(sin1>=0.9903&&sin1<0.9926) {
                    angleC=82.0;
                } else if(sin1>=0.9926&&sin1<0.9945) {
                    angleC=83.0;
                } else if(sin1>=0.9945&&sin1<0.9962) {
                    angleC=84.0;
                } else if(sin1>=0.9962&&sin1<0.9976) {
                    angleC=85.0;
                } else if(sin1>=0.9976&&sin1<0.9986) {
                    angleC=86.0;
                } else if(sin1>=0.9986&&sin1<0.9994) {
                    angleC=87.0;
                } else if(sin1>=0.9994&&sin1<0.9998) {
                    angleC=88.0;
                } else if(sin1>=0.9998&&sin1<1.0) {
                    angleC=89.0;
                }

                else if(sin1 == 1.0) {
                    angleC=90.0;
                }

                angleA = 180 - ( angleB + angleC);
                ang_c.setText(""+angleC);
                ang_a.setText(""+angleA);


                //here
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baselength.setText("");
                altitude.setText("");
                hypotenuse.setText("");
                ang_a.setText("");
                ang_b.setText("");
                ang_c.setText("");
            }
        });
    }
}
