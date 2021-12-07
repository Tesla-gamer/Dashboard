package com.example.bandmast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Dashboard extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setStatusBarColor(ContextCompat.getColor(Dashboard.this, R.color.colorAccent));
        setContentView(R.layout.activity_dashboard);
        handler=new Handler();
        handler.postDelayed(() -> {
            Intent intent=new Intent(Dashboard.this,MainActivity2.class);
            startActivity(intent);
            finish();
        },5000);
    }
}