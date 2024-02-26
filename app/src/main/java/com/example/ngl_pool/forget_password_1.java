package com.example.ngl_pool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forget_password_1 extends AppCompatActivity {
    Button resetPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password1);

        resetPassword = findViewById(R.id._bg__button_ek1);
        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forget_password_1.this, forgot_password_number.class);
                startActivity(i);

            }
        });
    }
}