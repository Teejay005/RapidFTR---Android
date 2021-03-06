package com.rapidftr.database;

import android.content.ContentValues;
import android.database.Cursor;

import java.io.Closeable;

public interface DatabaseSession extends Closeable {

    public Cursor rawQuery(String sql, String[] selectionArgs);
    public void execSQL(String sql);
    public int update(String table, ContentValues contentvalues, String whereClause, String[] whereArgs);
    public long replace(String table, String nullColumnHack, ContentValues values);
}
