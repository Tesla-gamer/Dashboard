package com.example.bandmast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Dashboard extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);
        handler=new Handler();
        handler.postDelayed(() -> {
            Intent intent=new Intent(Dashboard.this,MainActivity2.class);
            startActivity(intent);
            finish();
        },3000);
    }
}