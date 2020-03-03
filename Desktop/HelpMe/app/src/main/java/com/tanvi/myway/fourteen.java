package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class fourteen extends AppCompatActivity {

    TextView textView43,textView38;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);

        textView43=(TextView)findViewById(R.id.textView43);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView43.setTypeface(myCustomFont);

        textView38=(TextView)findViewById(R.id.textView38);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView38.setTypeface(myCustomFont1);


    }
}
