package com.example.musa.learntheword;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageButton anthem;
    ImageButton vowel;
    ImageButton conso;
    ImageButton rhy;
    ImageButton story;
    ImageButton ab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        anthem = (ImageButton) findViewById(R.id.btn1);
        anthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn1 = new Intent(HomeActivity.this,Anthem.class);
                startActivity(intentbtn1);
            }
        });

        vowel = (ImageButton) findViewById(R.id.btn2);
        vowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn2 = new Intent(HomeActivity.this,Vowel.class);
                startActivity(intentbtn2);
            }
        });

        conso = (ImageButton) findViewById(R.id.btn3);
        conso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn3 = new Intent(HomeActivity.this,Consonants.class);
                startActivity(intentbtn3);
            }
        });

        rhy = (ImageButton) findViewById(R.id.btn4);
        rhy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn4 = new Intent(HomeActivity.this,Rhyme.class);
                startActivity(intentbtn4);
            }
        });

        story = (ImageButton) findViewById(R.id.btn5);
        story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn5 = new Intent(HomeActivity.this,Story.class);
                startActivity(intentbtn5);
            }
        });

        ab = (ImageButton) findViewById(R.id.btn6);
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbtn6 = new Intent(HomeActivity.this,about.class);
                startActivity(intentbtn6);
            }
        });

    }
}
