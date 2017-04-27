package com.example.deepakjha.jamia_hamdard_app;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class unani_results extends AppCompatActivity {


    private RecyclerView mbloglist3;
    private DatabaseReference mDatabase3;
    FirebaseDatabase database;
    private DatabaseReference mDatabase4;
    private Query myquery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unani_results);

        if(!isConnected(unani_results.this))buildDialog(unani_results.this).show();
        else {
            setContentView(R.layout.activity_unani_results);
        }

        mDatabase3 = FirebaseDatabase.getInstance().getReference().child("UnaniResult");

        mbloglist3 = (RecyclerView) findViewById(R.id.unaniresult);
        mbloglist3.setHasFixedSize(true);
        mbloglist3.setLayoutManager(new LinearLayoutManager(this));


        database = FirebaseDatabase.getInstance();
        mDatabase3 = FirebaseDatabase.getInstance().getReference().child("UnaniResult");

        mDatabase4 = FirebaseDatabase.getInstance().getReference().child("UnaniResult");
        myquery=mDatabase4.orderByChild("description");






    }


    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Blog, BlogViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Blog, BlogViewHolder>(

                Blog.class,
                R.layout.blog_row,
                BlogViewHolder.class,
                mDatabase3

        ) {

            @Override
            protected void populateViewHolder(BlogViewHolder viewHolder, Blog model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setDescription(model.getDescription());
                viewHolder.mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(unani_results.this, "Click On The Link Please", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        };
        mbloglist3.setAdapter(firebaseRecyclerAdapter);

    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public BlogViewHolder(View itemView) {
            super(itemView);
            mView=itemView;
        }
        public void setTitle(String title){
            TextView post_title=(TextView) mView.findViewById(R.id.post_title);
            post_title.setText(title);

        }
        public void setDescription(String description){
            TextView post_des=(TextView) mView.findViewById(R.id.post_des);
            post_des.setText(description);

        }





    }
    //------------------------------no net-------------

    public boolean isConnected(Context context){
        ConnectivityManager cm=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo=cm.getActiveNetworkInfo();

        if(netinfo !=null && netinfo.isConnectedOrConnecting()){
            android.net.NetworkInfo wifi=cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile=cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile !=null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        }
        else return false;
    }


    public AlertDialog.Builder buildDialog(Context c){
        AlertDialog.Builder builder=new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection !");
        builder.setMessage("Turn On Your Mobile Data Or Connect Your Device To WIFI . Press Ok To Exit !");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        return builder;
    }




}
