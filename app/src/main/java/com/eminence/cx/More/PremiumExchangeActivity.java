package com.eminence.cx.More;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.eminence.cx.Adapters.SliderAdapter;
import com.eminence.cx.LoginActivity;
import com.eminence.cx.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PremiumExchangeActivity extends AppCompatActivity {
    SliderView sliderView;
    TextView loginPage;
    int[] images = {R.drawable.chessimgone, R.drawable.chessimgtwo, R.drawable.chessimhthree, R.drawable.chessimgone, R.drawable.chessimgtwo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium_exchange);
        getSupportActionBar().hide();

        sliderView = findViewById(R.id.image_slider);
        loginPage = findViewById(R.id.loginPage);

        loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        // Home Image Slider
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
    public void back(View view) {
        onBackPressed();
    }
}