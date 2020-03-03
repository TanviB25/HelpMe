package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class seventh extends AppCompatActivity {


    TextView textView12,textView24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        textView12=(TextView)findViewById(R.id.textView12);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView12.setTypeface(myCustomFont);

        textView24=(TextView)findViewById(R.id.textView24);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView24.setTypeface(myCustomFont1);
    }
}
