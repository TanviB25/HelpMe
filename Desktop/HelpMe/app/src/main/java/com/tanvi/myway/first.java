package com.tanvi.myway;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.TextView;

import com.tanvi.myway.R;

public class first extends AppCompatActivity {
    public Button b1, u1, button6;

    public ImageButton imageButton, imageButton4,imageButton3;

    TextView textView, textView52, textView23;


    protected void init() {
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent merimarzi = new Intent(first.this,listDonors.class);
                startActivity(merimarzi);
            }
        });

        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masterji = new Intent(first.this, second.class);
                startActivity(masterji);
            }
        });

        /*imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent cool = new Intent(first.this, testSeventeen.class);
                startActivity(cool);
            }
        });*/


        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dreams = new Intent(first.this, nine.class);
                startActivity(dreams);
            }
        });


        TextView textView52 = (TextView) findViewById(R.id.textView52 );
      Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(400); // blinking time with parameter
        anim.setStartOffset(150);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textView52.startAnimation(anim);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textView = (TextView) findViewById(R.id.textView);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "raleway.ttf");
        textView.setTypeface(myCustomFont);

        textView52 = (TextView) findViewById(R.id.textView33);
        Typeface myCustomFont1 = Typeface.createFromAsset(getAssets(), "raleway.ttf");
        textView52.setTypeface(myCustomFont1);

        textView23 = (TextView) findViewById(R.id.textView33);
        Typeface myCustomFont4 = Typeface.createFromAsset(getAssets(), "raleway.ttf");
        textView23.setTypeface(myCustomFont4);

       /* b1 = (Button) findViewById(R.id.b1);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(), "raleway.ttf");
        b1.setTypeface(myCustomFont2);

        u1 = (Button) findViewById(R.id.u1);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(), "raleway.ttf");
        u1.setTypeface(myCustomFont3);

        button6 = (Button) findViewById(R.id.button6);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(), "raleway.ttf");
        button6.setTypeface(myCustomFont5); */

        init();

    }
}
