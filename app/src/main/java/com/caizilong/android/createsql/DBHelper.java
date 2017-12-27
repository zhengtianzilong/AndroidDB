package com.caizilong.android.createsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Administrator on 2017/12/27.
 */

public class DBHelper extends SQLiteOpenHelper implements BaseColumns{

    public static final String DB_NAME = "contact.db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_NAME = "contactTable";

    public static final String _USERNAME = "username";

    public static final String _PHONE = "phone";
    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "("+_ID+" integer primary key autoincrement," + _USERNAME+ "text," + _PHONE +" text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
