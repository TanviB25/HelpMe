package com.tanvi.myway;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tanvi.myway.R;

import java.io.FileInputStream;

public class sixteen extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editText, editText2,editText3, editText4,editText6;
    Button button7,button10;

   // public MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen);
        myDb= new DatabaseHelper(this);

        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        editText6=(EditText)findViewById(R.id.editText6);
        button7=(Button)findViewById(R.id.button7);
        button10=(Button)findViewById(R.id.button10);
        AddData();
        viewAll();

    }
    public void AddData() {
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(editText.getText().toString(),
                        editText2.getText().toString(), editText3.getText().toString(),
                        editText4.getText().toString(), editText6.getText().toString());
                if (isInserted = true)
                    Toast.makeText(sixteen.this, "Data Added", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(sixteen.this, "Data not Added", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void viewAll(){
        button10.setOnClickListener(
                new View.OnClickListener()
                {
                  public void onClick(View v)
                  {
                   Cursor res = myDb.getAllData();
                    if (res.getCount()==0){
                    //display message
                    showMessage("Sorry","No Data Found!");
                    return;
                }

                StringBuffer buffer= new StringBuffer();

                while(res.moveToNext()){
                    buffer.append("Id :"+ res.getString(0)+"\n");
                    buffer.append("name :"+ res.getString(1)+"\n");
                    buffer.append("age :"+ res.getString(2)+"\n");
                    buffer.append("bgroup :"+ res.getString(3)+"\n");
                    buffer.append("phone :"+ res.getString(4)+"\n");
                    buffer.append("address :"+ res.getString(5)+"\n\n");

                }
                //show all data
                showMessage("Data",buffer.toString());
            }
        });
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
  /*  public void addDonor(View view) {

        startActivity(new Intent(this, sixteen.class));

    }*/

    /*public void displayDonors(View view){

       startActivity(new Intent(this,DisplayDonors.class));

   }*/

    /*String music="raw/music.mp3";
    AssetManager aM=getAssets();
    MediaPlayer mediaPlayer =new mediaPlayer();
    FileInputStream mp3Stream=aM.openFd(music.createInputStream());
    media.setDataSource(music.getFD());
    media.prepare();
    media.start();*/

    /*mP=MediaPlayer.create(sixteen.this,raw.music);

    mP.start();*/

   /*MediaPlayer mP=new MediaPlayer(this.getApplicationContext(),raw.music);

   mP.setAudioStreamType(AudioManager.STREAM_MUSIC);
    mP.start();
*/
}

