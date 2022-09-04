package com.eminence.cx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    Handler handler;
    ImageView splashScreenImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        splashScreenImage = findViewById(R.id.splashScreenImage);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this, MainActivity.class);
                //Animation hyperspaceJump = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.zoom_out);
                //splashScreenImage.startAnimation(hyperspaceJump);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}