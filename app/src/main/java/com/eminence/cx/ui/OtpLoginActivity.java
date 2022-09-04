package com.eminence.cx.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.eminence.cx.LoginActivity;
import com.eminence.cx.MainActivity;
import com.eminence.cx.R;

public class OtpLoginActivity extends AppCompatActivity {
    TextView confirmOtpBtn, editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_login);
        getSupportActionBar().hide();

        confirmOtpBtn = findViewById(R.id.confirmOtpBtn);
        editNumber = findViewById(R.id.editNumber);
        editNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        confirmOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        TextView textMobile = findViewById(R.id.numberMobile);
        textMobile.setText(String.format("+91-%s", getIntent().getStringExtra("mobile")));
    }
}