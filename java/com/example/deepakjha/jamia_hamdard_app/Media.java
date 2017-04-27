package com.example.deepakjha.jamia_hamdard_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Media extends AppCompatActivity {
    Button bb1,bb2,bb3,bb4,bb5,bb6,bb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        youtube();

    }
    public void youtube(){
        bb1=(Button)findViewById(R.id.button31);
        bb2=(Button)findViewById(R.id.button32);
        bb3=(Button)findViewById(R.id.button33);
        bb4=(Button)findViewById(R.id.button34);
        bb5=(Button)findViewById(R.id.button35);
        bb6=(Button)findViewById(R.id.button36);
        bb7=(Button)findViewById(R.id.button37);

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/aYUja-3mc7E"));
                startActivity(intent);
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/tG-Bejtv4So"));
                startActivity(intent);
            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/r6-IhqqjsZY"));
                startActivity(intent);
            }
        });

        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/nUx8W_s_KIM"));
                startActivity(intent);
            }
        });

        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/XO92wnm0flw"));
                startActivity(intent);
            }
        });

        bb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Jmbpor5N7o4"));
                startActivity(intent);
            }
        });

        bb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/RWFjAgf6nlo"));
                startActivity(intent);
            }
        });


    }

}
