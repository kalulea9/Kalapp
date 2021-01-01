package com.example.kalapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class myDbAdapter extends SQLiteOpenHelper {
    myDbAdapter myhelper;

    public myDbAdapter(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
    final String DB_NAME="myDatabase";
    final String TABLE_NAME="student_table";
    final String UID="id";
    final String FNAME="f_name";
    final String LNAME="l_name";
    final String REGNO="reg_no";
    final int DATABASE_VERSION=1;
    final String CREATE_TABLE="CREATE TABLE student_table"
     +TABLE_NAME +"("+UID +"INTEGER PRIMARY KEY AUTOINCREMENT,"
             + FNAME + "VARCHAR(45)" + LNAME + "VARCHAR(45)"
             + REGNO + "VARCHAR(45))";



     final String DROP_TABLE = "DROP TABLE IF EXISTS" + TABLE_NAME;
             Context context;

             try {
                 db.execSQL(CREATE_TABLE);
             }catch (Exception ex){
                 int text;
                 Toast.makeText(context,text:""+ex, Toast.LENGTH_SHORT).show();
             }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
