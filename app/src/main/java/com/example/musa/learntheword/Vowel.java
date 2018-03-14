package com.example.musa.learntheword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Vowel extends AppCompatActivity {

    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel);

        btn = (Button) findViewById(R.id.onebtn);
        btn1 = (Button) findViewById(R.id.twobtn);
        btn2 = (Button) findViewById(R.id.threebtn);
        btn3 = (Button) findViewById(R.id.fourbtn);
        btn4 = (Button) findViewById(R.id.fivebtn);
        btn5 = (Button) findViewById(R.id.sixbtn);
        btn6 = (Button) findViewById(R.id.sevenbtn);
        btn7 = (Button) findViewById(R.id.eightbtn);
        btn8 = (Button) findViewById(R.id.ninebtn);
        btn9 = (Button) findViewById(R.id.tenbtn);
        btn10 = (Button) findViewById(R.id.elevenbtn);

        imageView = (ImageView) findViewById(R.id.imageV);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.capture10);
            }
        });


    }
}
