package com.hanbit.contactsapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.hanbit.contactsapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanbit on 2017-03-08.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    final static String DATABASE_NAME="";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Memeber");
        onCreate(db);
    }

    public void insert(MemberBean member) {

    }


    public MemberBean selectOne(MemberBean member) {
        MemberBean bean = new MemberBean();
        return bean;
    }


    public List<MemberBean> selectSome(MemberBean member) {
        List<MemberBean> some = new ArrayList<>();
        return some;
    }


    public List<MemberBean> selectAll(MemberBean member) {
        List<MemberBean> list = new ArrayList<>();
        return list;
    }


    public void update(MemberBean member) {

    }


    public void delete(MemberBean member) {

    }

}
