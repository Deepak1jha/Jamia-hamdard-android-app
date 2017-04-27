package com.example.deepakjha.jamia_hamdard_app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class Extra extends AppCompatActivity {
    public static Button map,isc,emailus,contactt,facebook,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        jamia_map();
    }
    public void jamia_map()
    {
        map=(Button)findViewById(R.id.button22);
        isc=(Button)findViewById(R.id.button28);
        emailus=(Button)findViewById(R.id.button23);
        contactt=(Button)findViewById(R.id.button27);
        facebook=(Button)findViewById(R.id.button29);
        share=(Button)findViewById(R.id.button41);






        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapp=new Intent("com.example.deepakjha.jamia_hamdard_app.MapsActivity");
                startActivity(mapp);
            }
        });


        isc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent internation=new Intent("com.example.deepakjha.jamia_hamdard_app.international_student_cell");
                startActivity(internation);
            }
        });



        contactt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacttt=new Intent("com.example.deepakjha.jamia_hamdard_app.Contactjamia");
                startActivity(contacttt);
            }
        });





        emailus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent em=new Intent(Intent.ACTION_SEND);
                em.setData(Uri.parse("email"));
                String[] to={"gnqazi@jamiahamdard.ac.in","shamid@jamiahamdard.ac.in"};
                em.putExtra(Intent.EXTRA_EMAIL,to);
                em.putExtra(Intent.EXTRA_SUBJECT,"Help");
                em.putExtra(Intent.EXTRA_TEXT,"Email Body");
                em.setType("message/rfc822");
                Intent chooser=Intent.createChooser(em,"Emaill");
                startActivity(chooser);

            }
        });



        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookk = openFacebook(Extra.this);
                startActivity(facebookk);

            }
        });




        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myshare=new Intent(Intent.ACTION_SEND);
                myshare.setType("text/plain");
                String shareBody="Jamia Hamdard University";
                String sharesub="Your subject here";
                myshare.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                myshare.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myshare,"Share App Using"));
            }
        });







    }
    public static Intent openFacebook(Context context){
        try{
            context.getPackageManager().getPackageInfo("com.facebook.katana",0);
            return new Intent(Intent.ACTION_VIEW,Uri.parse("fb://page/104008189635968"));
        }
        catch (Exception e)
        {
            return new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/pages/Jamia-Hamdard/104008189635968"));
        }
    }
}
