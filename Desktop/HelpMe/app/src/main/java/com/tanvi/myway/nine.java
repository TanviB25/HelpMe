package com.tanvi.myway;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tanvi.myway.R;

public class nine extends AppCompatActivity {

    Button rm;

    TextView textView26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

        rm = (Button) findViewById(R.id.rm);
        rm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent dumdum = new Intent(nine.this, ten.class);
                startActivity(dumdum);
            }
        });

        textView26=(TextView)findViewById(R.id.textView26);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView26.setTypeface(myCustomFont);

        rm=(Button) findViewById(R.id.rm);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        rm.setTypeface(myCustomFont1);
    }
}
