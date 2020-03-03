package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class twelve extends AppCompatActivity {

    TextView textView36,textView41;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);


        textView36=(TextView)findViewById(R.id.textView36);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView36.setTypeface(myCustomFont);

        textView41=(TextView)findViewById(R.id.textView41);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView41.setTypeface(myCustomFont1);

    }
}
