package com.example.deepakjha.jamia_hamdard_app;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Feedback extends AppCompatActivity {

    private DatabaseReference databaseReference1;
    private EditText name,email,subject,message;
    private Button send;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name=(EditText)findViewById(R.id.editText);
        email=(EditText)findViewById(R.id.editText3);
        subject=(EditText)findViewById(R.id.editText5);
        message=(EditText)findViewById(R.id.editText6);
        send=(Button)findViewById(R.id.button39);
        progressDialog=new ProgressDialog(this);

        databaseReference1=(FirebaseDatabase.getInstance().getReference().child("feedback"));

        send.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                progressDialog.setMessage("FeedBack Sending...");

               final String namee=name.getText().toString().trim();
                final String emaill=email.getText().toString().trim();
                final String subjectt=subject.getText().toString().trim();
                final String messagee=message.getText().toString().trim();
                if(!TextUtils.isEmpty(namee) && !TextUtils.isEmpty(emaill)&&!TextUtils.isEmpty(subjectt)&&!TextUtils.isEmpty(messagee)){
                    progressDialog.show();

                    final DatabaseReference feedback=databaseReference1.push();
                    databaseReference1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            feedback.child("name").setValue(namee);
                            feedback.child("email").setValue(emaill);
                            feedback.child("subject").setValue(subjectt);
                            feedback.child("message").setValue(messagee).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if(task.isSuccessful()) {

                                        progressDialog.dismiss();
                                        Intent intent = new Intent("com.example.deepakjha.jamia_hamdard_app.Aboutus");
                                        startActivity(intent);
                                      // Toast.makeText(Aboutus.this, "FeedBack sent..", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });





                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                }



                if(TextUtils.isEmpty(namee) || TextUtils.isEmpty(emaill) || TextUtils.isEmpty(subjectt) || TextUtils.isEmpty(messagee)){
                    Toast.makeText(Feedback.this, "Please Fil All The Detail !", Toast.LENGTH_SHORT).show();
                }




            }
        });
    }
}
