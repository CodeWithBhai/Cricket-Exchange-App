package com.eminence.cx.LatestNews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eminence.cx.R;

public class LatestNewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_news);
        getSupportActionBar().hide();
    }
}