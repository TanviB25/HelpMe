package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class eight extends AppCompatActivity {

    TextView textView15,textView25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        textView15=(TextView)findViewById(R.id.textView15);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView15.setTypeface(myCustomFont);

        textView25=(TextView)findViewById(R.id.textView25);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView25.setTypeface(myCustomFont1);
    }
}
