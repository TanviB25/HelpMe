package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class fifteen extends AppCompatActivity {

    TextView textView39,textView44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);

        textView39=(TextView)findViewById(R.id.textView39);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView39.setTypeface(myCustomFont);

        textView44=(TextView)findViewById(R.id.textView44);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView44.setTypeface(myCustomFont1);

    }
}
