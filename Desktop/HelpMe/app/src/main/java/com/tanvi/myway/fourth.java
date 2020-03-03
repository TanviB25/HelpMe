package com.tanvi.myway;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tanvi.myway.R;

public class fourth extends AppCompatActivity {

    public Button b7, button5, button, button2,button3, button4;

    TextView textView3, textView4,textView14, textView5, textView6, textView7, textView8, textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        TextView t1=(TextView)findViewById(R.id.textView5);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2=(TextView)findViewById(R.id.textView6);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3=(TextView)findViewById(R.id.textView7);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4=(TextView)findViewById(R.id.textView8);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5=(TextView)findViewById(R.id.textView9);
        t5.setMovementMethod(LinkMovementMethod.getInstance());




        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent harry = new Intent(Intent.ACTION_VIEW);
                harry.setData(Uri.parse("http://www.maps.google.com"));
                startActivity(harry);

            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent udi = new Intent(fourth.this, eleven.class);
                startActivity(udi);
            }
        });


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent rami = new Intent(fourth.this, twelve.class);
                startActivity(rami);
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent nolii = new Intent(fourth.this, thirteen.class);
                startActivity(nolii);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent chiu = new Intent(fourth.this, fourteen.class);
                startActivity(chiu);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent que = new Intent(fourth.this, fifteen.class);
                startActivity(que);
            }
        });


        textView3=(TextView)findViewById(R.id.textView3);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView3.setTypeface(myCustomFont);

        textView4=(TextView)findViewById(R.id.textView4);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView4.setTypeface(myCustomFont1);

        textView5=(TextView)findViewById(R.id.textView5);
        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView5.setTypeface(myCustomFont2);

        textView6=(TextView)findViewById(R.id.textView6);
        Typeface myCustomFont3= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView6.setTypeface(myCustomFont3);

        textView7=(TextView)findViewById(R.id.textView7);
        Typeface myCustomFont4= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView7.setTypeface(myCustomFont4);

        textView8=(TextView)findViewById(R.id.textView8);
        Typeface myCustomFont5= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView8.setTypeface(myCustomFont5);

        textView9=(TextView)findViewById(R.id.textView9);
        Typeface myCustomFont6= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView9.setTypeface(myCustomFont6);

        button=(Button)findViewById(R.id.button);
        Typeface myCustomFont7= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        button.setTypeface(myCustomFont7);

        button2=(Button)findViewById(R.id.button2);
        Typeface myCustomFont8= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        button2.setTypeface(myCustomFont8);

        button3=(Button)findViewById(R.id.button3);
        Typeface myCustomFont9= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        button3.setTypeface(myCustomFont9);

        button4=(Button) findViewById(R.id.button4);
        Typeface myCustomFont10= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        button4.setTypeface(myCustomFont10);

        button5=(Button) findViewById(R.id.button5);
        Typeface myCustomFont11= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        button5.setTypeface(myCustomFont11);

        b7=(Button) findViewById(R.id.b7);
        Typeface myCustomFont12= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        b7.setTypeface(myCustomFont12);

        textView14=(TextView)findViewById(R.id.textView14);
        Typeface myCustomFont13= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        textView14.setTypeface(myCustomFont13);

    }
}