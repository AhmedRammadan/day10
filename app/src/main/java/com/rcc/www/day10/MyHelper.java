package com.rcc.www.day10;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    public MyHelper(Context context) {
        //here we'll create the database Elsaiyda
        super(context, "Elsaiyda", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //here we'll create tables
        db.execSQL("  create table students(id integer primary key autoincrement,name varchar(50),age integer)");
        db.execSQL("  create table teachers(id integer primary key autoincrement,name varchar(50),age integer)");
        //db.execSQL("  create table employees(id integer primary key autoincrement,name varchar(50),age integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("drop table students");
       onCreate(db);
    }
}
