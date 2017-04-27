package com.example.deepakjha.jamia_hamdard_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

import static android.R.id.button3;

public class HomeScreen extends Activity {
    Button admission_button,about_button,courses_button,extra_button,media_button,newsevents_button,placement_button,results_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_screen);
        Homescreen_activity();
    }
    public void Homescreen_activity()
    {
        admission_button=(Button)findViewById(R.id.button3);
        newsevents_button=(Button)findViewById(R.id.button5);
       results_button =(Button)findViewById(R.id.button2);
       courses_button =(Button)findViewById(R.id.button7);
       placement_button =(Button)findViewById(R.id.button6);
       media_button =(Button)findViewById(R.id.button10);
       extra_button =(Button)findViewById(R.id.button26);
       about_button =(Button)findViewById(R.id.button11);

        admission_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admissionn=new Intent("com.example.deepakjha.jamia_hamdard_app.Admission");
                startActivity(admissionn);
                Animation animation_one=new AlphaAnimation(1.0f,0.0f);
                animation_one.setDuration(100);
                admission_button.startAnimation(animation_one);
            }
        });


        newsevents_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newsevent=new Intent("com.example.deepakjha.jamia_hamdard_app.Newsfeed");
                startActivity(newsevent);
                Animation animation_one2=new AlphaAnimation(1.0f,0.0f);
                animation_one2.setDuration(100);
                newsevents_button.startAnimation(animation_one2);
            }
        });


        results_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultss=new Intent("com.example.deepakjha.jamia_hamdard_app.Authentication");
                startActivity(resultss);
                Animation animation_one3=new AlphaAnimation(1.0f,0.0f);
                animation_one3.setDuration(50);
                results_button.startAnimation(animation_one3);
            }
        });


        courses_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coursess=new Intent("com.example.deepakjha.jamia_hamdard_app.Courses");
                startActivity(coursess);
                Animation animation_one4=new AlphaAnimation(1.0f,0.0f);
                animation_one4.setDuration(100);
                courses_button.startAnimation(animation_one4);
            }
        });


        placement_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placementss=new Intent("com.example.deepakjha.jamia_hamdard_app.Placement");
                startActivity(placementss);
                Animation animation_one5=new AlphaAnimation(1.0f,0.0f);
                animation_one5.setDuration(100);
                placement_button.startAnimation(animation_one5);
            }
        });


        media_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediaa=new Intent("com.example.deepakjha.jamia_hamdard_app.Media");
                startActivity(mediaa);
                Animation animation_one6=new AlphaAnimation(1.0f,0.0f);
                animation_one6.setDuration(100);
                media_button.startAnimation(animation_one6);
            }
        });


       extra_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent extra =new Intent("com.example.deepakjha.jamia_hamdard_app.Extra");
              startActivity(extra);
               Animation animation_one66=new AlphaAnimation(1.0f,0.0f);
               animation_one66.setDuration(100);
               extra_button.startAnimation(animation_one66);
           }
       });


        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutt=new Intent("com.example.deepakjha.jamia_hamdard_app.Aboutus");
                startActivity(aboutt);
                Animation animation_one8=new AlphaAnimation(1.0f,0.0f);
                animation_one8.setDuration(100);
                about_button.startAnimation(animation_one8);
            }
        });





    }





}
