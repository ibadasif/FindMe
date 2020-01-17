package com.example.findme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home extends AppCompatActivity {
    ImageView hosp;
    ImageView rest;
    ImageView school;
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        int images[]={R.drawable.sch,R.drawable.hosp,R.drawable.rest,R.drawable.sch1,R.drawable.hosp1,R.drawable.rest1};
        v_flipper= findViewById(R.id.v_flipper);
        for(int i = 0; i < images.length; i++){
            flipperImages(images[i]);
        }
        for(int image: images){
            flipperImages(image);
        }
        hosp= findViewById(R.id.fhosp);
        hosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(Home.this,Hospitals.class);
                startActivity(a);
            }
        });
        rest= findViewById(R.id.frest);
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Home.this, Resturants.class);
                startActivity(b);
            }
        });
        school= findViewById(R.id.fstu);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c= new Intent(Home.this, School.class);
                startActivity(c);
            }
        });

    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
