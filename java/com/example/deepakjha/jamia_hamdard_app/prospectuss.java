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

public class prospectuss extends AppCompatActivity {
    Button addlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prospectuss);
        pros();
    }
    public void pros(){
        addlink=(Button)findViewById(R.id.button38);
        addlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proslink=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jamiahamdard.ac.in/PDF/Prospectus_2016-2017.pdf"));
                startActivity(proslink);
            }
        });
    }
}
