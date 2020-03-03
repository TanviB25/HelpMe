package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class sixth extends AppCompatActivity {

    TextView textView10, textView21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        textView10=(TextView)findViewById(R.id.textView10);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView10.setTypeface(myCustomFont);

        textView21=(TextView)findViewById(R.id.textView21);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView21.setTypeface(myCustomFont1);

    }
}
