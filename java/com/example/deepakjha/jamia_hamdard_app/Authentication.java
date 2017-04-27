package com.example.deepakjha.jamia_hamdard_app;


import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Authentication extends AppCompatActivity {
    TextView himsr,unani;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
        results();

    }
    public void results(){
        himsr=(TextView)findViewById(R.id.textView265);
        himsr.setPaintFlags(himsr.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        unani=(TextView)findViewById(R.id.textView270);
        unani.setPaintFlags(himsr.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        himsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fet=new Intent("com.example.deepakjha.jamia_hamdard_app.fet_result");
                startActivity(fet);
            }
        });

        unani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unanii=new Intent("com.example.deepakjha.jamia_hamdard_app.unani_results");
                startActivity(unanii);
            }
        });
    }
}


