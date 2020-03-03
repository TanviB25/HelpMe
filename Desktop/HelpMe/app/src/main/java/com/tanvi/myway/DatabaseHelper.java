package com.tanvi.myway;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tanvi on 7/5/17.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="Donor.db";
    public static final String TABLE_NAME="donor_table";
    public static final String COL_1="ID";
    public static final String COL_2="NAME";
    public static final String COL_3="AGE";
    public static final String COL_4="BGROUP";
    public static final String COL_5="PHONE";
    public static final String COL_6="ADDRESS";

    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME, null,1);
       // SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT, AGE INTEGER, BGROUP TEXT, PHONE INTEGER, ADDRESS TEXT)" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String age, String bgroup, String phone, String address)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,age);
        contentValues.put(COL_4,bgroup);
        contentValues.put(COL_5,phone);
        contentValues.put(COL_6,address);
       long result= db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;

    }

    public Cursor getAllData(){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from " +TABLE_NAME,null);
        return res;

    }
}
