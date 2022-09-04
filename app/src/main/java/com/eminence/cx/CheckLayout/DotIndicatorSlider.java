package com.eminence.cx.CheckLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.eminence.cx.Adapters.ViewAdapter;
import com.eminence.cx.R;

public class DotIndicatorSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_indicator_slider);
        getSupportActionBar().hide();


    }
}