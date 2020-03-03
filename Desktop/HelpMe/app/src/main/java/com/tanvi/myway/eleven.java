package com.tanvi.myway;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tanvi.myway.R;

public class eleven extends AppCompatActivity {

    TextView textView35,textView40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);


        textView35=(TextView)findViewById(R.id.textView35);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView35.setTypeface(myCustomFont);

        textView40=(TextView)findViewById(R.id.textView40);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"Quicksand.otf");
        textView40.setTypeface(myCustomFont1);

    }
}
