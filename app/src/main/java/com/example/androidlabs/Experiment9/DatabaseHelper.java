package com.example.androidlabs.Experiment9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String MyDatabase="database.db";
    public static final String MyTable="student";

    public DatabaseHelper(Context C, String name, SQLiteDatabase.CursorFactory factory,int Version){
        super(C,MyDatabase,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table "+MyTable+"(id INTEGER Primary Key, Name Text, SAPID Text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+MyTable+" ");
        onCreate(db);
    }
    public boolean insertData(Integer id,String name, String SAPID){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("ID",id);
        contentValues.put("name",name);
        contentValues.put("SAPID",SAPID);
        long r=db.insert(MyTable,null,contentValues);
        if(r<0){
            return false;
        }
        else return true;
    }
    public Cursor getAlldata(){
        SQLiteDatabase db=getReadableDatabase();
        Cursor C=db.rawQuery("Select * from "+MyTable,null);
        return C;



    }
}
