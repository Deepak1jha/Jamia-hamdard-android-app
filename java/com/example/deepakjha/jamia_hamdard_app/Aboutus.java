package com.example.deepakjha.jamia_hamdard_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aboutus extends AppCompatActivity {
    Button whyjamia,reputed,cmps,rank,feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        whyjamiaa();
    }
    public void whyjamiaa()
    {
        whyjamia=(Button)findViewById(R.id.button21);
        reputed=(Button)findViewById(R.id.button24);
        cmps=(Button)findViewById(R.id.button25);
        rank=(Button)findViewById(R.id.button20);
        feedback=(Button)findViewById(R.id.button30);

        whyjamia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent why=new Intent("com.example.deepakjha.jamia_hamdard_app.why_jamia");
                startActivity(why);
            }
        });
        reputed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rf=new Intent("com.example.deepakjha.jamia_hamdard_app.reputed_faculty");
                startActivity(rf);
            }
        });
        cmps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cf=new Intent("com.example.deepakjha.jamia_hamdard_app.campus_facilities");
                startActivity(cf);
            }
        });
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rt=new Intent("com.example.deepakjha.jamia_hamdard_app.Rank");
                startActivity(rt);
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rtt=new Intent("com.example.deepakjha.jamia_hamdard_app.Feedback");
                startActivity(rtt);
            }
        });
    }
}
