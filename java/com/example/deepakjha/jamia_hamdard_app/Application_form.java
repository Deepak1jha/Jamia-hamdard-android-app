package com.example.deepakjha.jamia_hamdard_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Application_form extends AppCompatActivity {
    TextView tv,tvv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form);
        TextView tv = (TextView) findViewById(R.id.textView222);
        tv.setText(Html.fromHtml("<a href=http://jamia.mycollegeform.com/login/> Click here "));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

        TextView tvv = (TextView) findViewById(R.id.textView239);
        tvv.setText(Html.fromHtml("<a href=http://www.jamiahamdard.ac.in/odl_PDF/JH_DODL_Application%20form.pdf> Click here "));
        tvv.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
