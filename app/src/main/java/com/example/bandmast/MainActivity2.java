package com.example.bandmast;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}