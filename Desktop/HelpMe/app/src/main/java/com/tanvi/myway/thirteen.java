package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class thirteen extends AppCompatActivity {

    TextView textView37,textView42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);


        textView37=(TextView)findViewById(R.id.textView37);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView37.setTypeface(myCustomFont);

        textView42=(TextView)findViewById(R.id.textView42);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView42.setTypeface(myCustomFont1);

    }
}
