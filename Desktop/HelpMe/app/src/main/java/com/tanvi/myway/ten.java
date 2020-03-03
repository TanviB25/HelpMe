package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class ten extends AppCompatActivity {

    TextView textView20,textView22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);

        textView20=(TextView)findViewById(R.id.textView20);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView20.setTypeface(myCustomFont);

        textView22=(TextView)findViewById(R.id.textView22);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView22.setTypeface(myCustomFont1);
    }
}
