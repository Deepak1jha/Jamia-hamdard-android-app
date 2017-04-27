package com.example.deepakjha.jamia_hamdard_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admission extends AppCompatActivity {
   Button admission_form,prospectus_go,scholarship_go,loans_go,counseliing_go,faqs_go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);
      admissionabc();


    }
    public void admissionabc()
    {

        admission_form=(Button)findViewById(R.id.button16);
        prospectus_go =(Button)findViewById(R.id.button9);
        scholarship_go =(Button)findViewById(R.id.button12);
        loans_go=(Button)findViewById(R.id.button13);
        counseliing_go=(Button)findViewById(R.id.button14);
        faqs_go=(Button)findViewById(R.id.button15);



       admission_form.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ad_formm=new Intent("com.example.deepakjha.jamia_hamdard_app.Application_form");
               startActivity(ad_formm);
           }
       });


       prospectus_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prospectuss=new Intent("com.example.deepakjha.jamia_hamdard_app.prospectuss");
                startActivity(prospectuss);
           }
       });

       scholarship_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prospectuss=new Intent("com.example.deepakjha.jamia_hamdard_app.Scholarship");
                startActivity(prospectuss);
            }
        });

        loans_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prospectuss=new Intent("com.example.deepakjha.jamia_hamdard_app.Loans");
                startActivity(prospectuss);
            }
        });


        counseliing_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prospectuss=new Intent("com.example.deepakjha.jamia_hamdard_app.counselling");
                startActivity(prospectuss);
            }
        });


        faqs_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prospectuss=new Intent("com.example.deepakjha.jamia_hamdard_app.Faqs");
                startActivity(prospectuss);
            }
        });






    }


}
