package com.example.musa.learntheword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Rhyme extends AppCompatActivity {

   // TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhyme);


       /* textView = (TextView) findViewById(R.id.rhy);


        String text = "";

        try{
            InputStream inputStream = getAssets().open("ryth.txt");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            text = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        textView.setText(text);*/



    }
}
