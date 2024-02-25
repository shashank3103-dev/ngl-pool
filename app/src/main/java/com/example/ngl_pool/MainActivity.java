package com.example.ngl_pool;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final long SPLASH_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Use your splash layout here

        // Delay transition to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start main activity
                Intent intent = new Intent(MainActivity.this, sign_in.class);
                startActivity(intent);
                finish(); // Close splash activity to prevent user from navigating back
            }
        }, SPLASH_DURATION);
    }
}
