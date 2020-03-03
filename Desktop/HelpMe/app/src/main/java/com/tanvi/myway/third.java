package com.tanvi.myway;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.tanvi.myway.R;

public class third extends AppCompatActivity {


    ImageButton i1, i2, i3, i4;
    TextView textView2,textView13, textView16,textView17,textView18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);

i1 = (ImageButton) findViewById(R.id.i1);
        i1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent jasmine = new Intent(third.this, fifth.class);
                startActivity(jasmine);

            }
        });

        i2 = (ImageButton) findViewById(R.id.i2);
        i2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent rose = new Intent(third.this, sixth.class);
                startActivity(rose);

            }
        });


       i3 = (ImageButton) findViewById(R.id.i3);
        i3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent lotus = new Intent(third.this, seventh.class);
                startActivity(lotus);
            }
        });

        i4 = (ImageButton) findViewById(R.id.i4);
        i4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent sam = new Intent(third.this, eight.class);
                startActivity(sam);


            }
        });

        textView2=(TextView)findViewById(R.id.textView2);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView2.setTypeface(myCustomFont);

        textView13=(TextView)findViewById(R.id.textView13);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView13.setTypeface(myCustomFont1);

        textView16=(TextView)findViewById(R.id.textView16);
        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView16.setTypeface(myCustomFont2);

        textView17=(TextView)findViewById(R.id.textView17);
        Typeface myCustomFont3= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView17.setTypeface(myCustomFont3);

        textView18=(TextView)findViewById(R.id.textView18);
        Typeface myCustomFont4= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView18.setTypeface(myCustomFont4);

    }
}