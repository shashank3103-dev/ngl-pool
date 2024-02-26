package com.example.ngl_pool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_in extends AppCompatActivity {
    TextView create_account, forgotPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        create_account = findViewById(R.id._don_t_have_an_account__create_account);

        forgotPassword= findViewById(R.id._forgot_password_);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgot = new Intent(sign_in.this,forgot_password_radio_button.class);
                startActivity(forgot);

            }
        });

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sign_in.this,sign_up.class);
                startActivity(i);
            }
        });
    }
}