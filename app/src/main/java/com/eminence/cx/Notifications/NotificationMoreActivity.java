package com.eminence.cx.Notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.eminence.cx.R;

public class NotificationMoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_more);
        getSupportActionBar().hide();
    }
    public void back(View view) {
        onBackPressed();
    }
}