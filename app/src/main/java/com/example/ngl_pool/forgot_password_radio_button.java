package com.example.ngl_pool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgot_password_radio_button extends AppCompatActivity {
   Button _bg__button_ek1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_radio_button);

        _bg__button_ek1 = findViewById(R.id._bg__button_ek1);
        _bg__button_ek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(forgot_password_radio_button.this,forgot_password_0.class);
                startActivity(i);
            }
        });
    }
}