package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class fifth extends AppCompatActivity {

    TextView  textView11,  textView19,  textView28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        textView11=(TextView)findViewById(R.id.textView11);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView11.setTypeface(myCustomFont);

        textView19=(TextView)findViewById(R.id.textView19);
        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView19.setTypeface(myCustomFont2);

        textView28=(TextView)findViewById(R.id.textView28);
        Typeface myCustomFont3= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView28.setTypeface(myCustomFont3);
    }
}
