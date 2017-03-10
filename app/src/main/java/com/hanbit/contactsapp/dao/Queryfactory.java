package com.hanbit.contactsapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hanbit on 2017-03-10.
 */

public abstract class Queryfactory {
    SQLiteDatabase db;
    SQLiteOpenHelper helper;
    Context context;

    public Queryfactory(Context context) {
        this.context = context;

    }

    public abstract SQLiteDatabase getDatabase();


}
