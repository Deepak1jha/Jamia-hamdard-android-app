package com.example.deepakjha.jamia_hamdard_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Courses extends AppCompatActivity {
    Button graduation_button,post_graduation,distance_learning,dip_loma,btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        programme();

    }
    public void programme()
    {
        graduation_button=(Button)findViewById(R.id.button18);
        post_graduation=(Button)findViewById(R.id.button17);
        distance_learning=(Button)findViewById(R.id.button8);
        dip_loma=(Button)findViewById(R.id.button);


        graduation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gb=new Intent("com.example.deepakjha.jamia_hamdard_app.Graduation__activity");
                startActivity(gb);
            }
        });

        post_graduation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pg=new Intent("com.example.deepakjha.jamia_hamdard_app.Post_graduation");
                startActivity(pg);
            }
        });

        distance_learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dodl=new Intent("com.example.deepakjha.jamia_hamdard_app.Dodl");
                startActivity(dodl);
            }
        });
        dip_loma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dplm=new Intent("com.example.deepakjha.jamia_hamdard_app.Diploma");
                startActivity(dplm);
            }
        });

    }

    }

