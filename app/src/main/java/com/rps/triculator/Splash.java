package com.rps.triculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Splash extends AppCompatActivity implements Animation.AnimationListener {

    Animation animslidedown;
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ll=(LinearLayout) findViewById(R.id.linear_layout);

        animslidedown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideup);
        animslidedown.setAnimationListener(this);

        ActionBar actionBar=getSupportActionBar();

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        actionBar.hide();
        /*new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Splash.this,Home.class);
                startActivity(i);
                finish();
            }
        }, 3000);*/

        ll.setAnimation(animslidedown);



    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if (animation == animslidedown) {

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    Intent i = new Intent(Splash.this,Home.class);
                    startActivity(i);
                    finish();
                }
            }, 1000);


        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
