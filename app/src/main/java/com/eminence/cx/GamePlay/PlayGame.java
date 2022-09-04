package com.eminence.cx.GamePlay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eminence.cx.R;

public class PlayGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        getSupportActionBar().hide();
    }
}