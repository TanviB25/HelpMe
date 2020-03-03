package com.tanvi.myway;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.tanvi.myway.R;

public class second extends AppCompatActivity {


    Button b5,b2,b3,b6,fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent swapi = new Intent(second.this, third.class);
                startActivity(swapi);
            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent messi = new Intent(Intent.ACTION_CALL);
                messi.setData(Uri.parse("tel:*123#")); ///102
                startActivity(messi);

              /*  if (ActivityCompat.checkSelfPermission(getBaseContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }*/


            }
        });

        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent nic = new Intent(second.this, fourth.class);
                startActivity(nic);
            }
        });

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent gera = new Intent(Intent.ACTION_CALL);
                gera.setData(Uri.parse("tel:7738356094"));   ////100
                startActivity(gera);
                //if (ActivityCompat.checkSelfPermission(getBaseContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    //return;
              //  }
            }
        });

        fr = (Button) findViewById(R.id.fr);
        fr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent master = new Intent(Intent.ACTION_CALL);
                master.setData(Uri.parse("tel:7738356093")); ///101
                if (ActivityCompat.checkSelfPermission(second.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                    return;   ///getBaseContext()
                }
                startActivity(master);


            }
        });


        fr=(Button) findViewById(R.id.fr);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        fr.setTypeface(myCustomFont);

        b2=(Button) findViewById(R.id.b2);
        Typeface myCustomFont1= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        b2.setTypeface(myCustomFont1);

        b3=(Button) findViewById(R.id.b3);
        Typeface myCustomFont2= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        b3.setTypeface(myCustomFont2);

        b5=(Button) findViewById(R.id.b5);
        Typeface myCustomFont3= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        b5.setTypeface(myCustomFont3);

        b6=(Button) findViewById(R.id.b6);
        Typeface myCustomFont4= Typeface.createFromAsset(getAssets(),"raleway.ttf");
        b6.setTypeface(myCustomFont4);


    }

    @TargetApi(Build.VERSION_CODES.M)

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}



