package com.example.musa.learntheword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Consonants extends AppCompatActivity {

    Button cbtn,cbtn1,cbtn2,cbtn3,cbtn4,cbtn5,cbtn6,cbtn7,cbtn8,cbtn9,cbtn10,cbtn11,cbtn12,cbtn13,cbtn14,cbtn15,cbtn16,cbtn17,cbtn18,cbtn19,cbtn20,cbtn21,cbtn22,cbtn23,cbtn24,cbtn25,cbtn26,cbtn27,cbtn28,cbtn29,cbtn30,cbtn31,cbtn32,cbtn33,cbtn34,cbtn35,cbtn36,cbtn37,cbtn38;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consonants);

        cbtn = (Button) findViewById(R.id.conebtn);
        cbtn1 = (Button) findViewById(R.id.ctwobtn);
        cbtn2 = (Button) findViewById(R.id.cthreebtn);
       cbtn3 = (Button) findViewById(R.id.cfourbtn);
        cbtn4 = (Button) findViewById(R.id.cfivebtn);
        cbtn5 = (Button) findViewById(R.id.csixbtn);
        cbtn6 = (Button) findViewById(R.id.csevenbtn);
        cbtn7 = (Button) findViewById(R.id.ceightbtn);
        cbtn8 = (Button) findViewById(R.id.cninebtn);
        cbtn9 = (Button) findViewById(R.id.ctenbtn);
        cbtn10 = (Button) findViewById(R.id.celevenbtn);
        cbtn11 = (Button) findViewById(R.id.ctwelvebtn);
        cbtn12 = (Button) findViewById(R.id.cthirteenbtn);
        cbtn13 = (Button) findViewById(R.id.cfourteenbtn);
        cbtn14 = (Button) findViewById(R.id.cfivteenbtn);
        cbtn15 = (Button) findViewById(R.id.csixteenbtn);
        cbtn16 = (Button) findViewById(R.id.cseventenbtn);
        cbtn17 = (Button) findViewById(R.id.ceightenbtn);
        cbtn18 = (Button) findViewById(R.id.cnintenbtn);
        cbtn19 = (Button) findViewById(R.id.ctwentybtn);
        cbtn20 = (Button) findViewById(R.id.ctwonebtn);
        cbtn21 = (Button) findViewById(R.id.ctwtwobtn);
        cbtn22 = (Button) findViewById(R.id.ctwthreebtn);
        cbtn23 = (Button) findViewById(R.id.ctwfourbtn);
        cbtn24 = (Button) findViewById(R.id.ctwfivebtn);
        cbtn25 = (Button) findViewById(R.id.ctwsixbtn);
        cbtn26 = (Button) findViewById(R.id.ctwsevenbtn);
        cbtn27 = (Button) findViewById(R.id.ctweightbtn);
        cbtn28 = (Button) findViewById(R.id.ctwninebtn);
        cbtn29 = (Button) findViewById(R.id.cthirtybtn);
        cbtn30 = (Button) findViewById(R.id.cthonebtn);
        cbtn31 = (Button) findViewById(R.id.cthtwobtn);
        cbtn32 = (Button) findViewById(R.id.cththreebtn);
        cbtn33 = (Button) findViewById(R.id.cthfourbtn);
        cbtn34 = (Button) findViewById(R.id.cthfivebtn);
        cbtn35 = (Button) findViewById(R.id.cthsixbtn);
        cbtn36 = (Button) findViewById(R.id.cthsevenbtn);
        cbtn37 = (Button) findViewById(R.id.ctheightbtn);
        cbtn38 = (Button) findViewById(R.id.cthninebtn);

        imageView1 = (ImageView) findViewById(R.id.imageVv);

        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture11);
            }
        });
        cbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture12);
            }
        });
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture13);
            }
        });
        cbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture14);
            }
        });
        cbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture15);
            }
        });
        cbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture16);
            }
        });
        cbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture17);
            }
        });
        cbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture18);
            }
        });
        cbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture19);
            }
        });
        cbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture20);
            }
        });
        cbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture21);
            }
        });
        cbtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture22);
            }
        });
        cbtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture23);
            }
        });
        cbtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture24);
            }
        });
        cbtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture25);
            }
        });
        cbtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture26);
            }
        });
        cbtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture27);
            }
        });
        cbtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture28);
            }
        });
        cbtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture29);
            }
        });
        cbtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture30);
            }
        });
        cbtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture31);
            }
        });
        cbtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture32);
            }
        });


        cbtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture33);
            }
        });
        cbtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture34);
            }
        });
        cbtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture35);
            }
        });
        cbtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture36);
            }
        });
        cbtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture37);
            }
        });
        cbtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture38);
            }
        });
        cbtn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture39);
            }
        });
        cbtn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture40);
            }
        });
        cbtn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture41);
            }
        });
        cbtn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture42);
            }
        });
        cbtn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture43);
            }
        });

        cbtn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture44);
            }
        });
        cbtn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture45);
            }
        });
        cbtn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture46);
            }
        });
        cbtn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture47);
            }
        });
        cbtn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture48);
            }
        });
        cbtn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(R.drawable.capture49);
            }
        });



    }
}
