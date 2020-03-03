package com.tanvi.myway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tanvi.myway.R;

public class listDonors extends AppCompatActivity {

    Button button9,button8,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_donors);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masterji = new Intent(listDonors.this, sixteen.class);
                startActivity(masterji);
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent ukta = new Intent(listDonors.this, SearchDonor.class);
                startActivity(ukta);
            }
        });



        }

}
