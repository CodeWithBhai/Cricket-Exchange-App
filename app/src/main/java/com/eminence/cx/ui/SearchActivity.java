package com.eminence.cx.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eminence.cx.R;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().hide();
    }
}