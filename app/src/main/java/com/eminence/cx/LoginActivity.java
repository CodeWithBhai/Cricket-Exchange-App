package com.eminence.cx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.eminence.cx.ui.OtpLoginActivity;

public class LoginActivity extends AppCompatActivity {
    Button sendOtpBtn;
    EditText enterNumberOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        sendOtpBtn  = findViewById(R.id.sendOtpBtn);
        enterNumberOtp  = findViewById(R.id.enterNumberOtp);

        sendOtpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (enterNumberOtp.getText().toString().trim().isEmpty()){
                   Toast.makeText(LoginActivity.this, "Please Enter Number", Toast.LENGTH_SHORT).show();
                   return;
               }
               Intent intent = new Intent(getApplicationContext(), OtpLoginActivity.class);
               intent.putExtra("mobile", enterNumberOtp.getText().toString());
               startActivity(intent);
            }
        });

        enterNumberOtp.addTextChangedListener(loginTextWatcher);

    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String number = enterNumberOtp.getText().toString().trim();

            sendOtpBtn.setEnabled(!number.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    public void back(View view) {
        onBackPressed();
    }
}