package com.example.deepakjha.jamia_hamdard_app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class First_screen extends AppCompatActivity {
    private static int Time_Delayed =4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Homescreenn=new Intent("com.example.deepakjha.jamia_hamdard_app.HomeScreen");
                startActivity(Homescreenn);
                finish();


            }
        },Time_Delayed);
    }
}
