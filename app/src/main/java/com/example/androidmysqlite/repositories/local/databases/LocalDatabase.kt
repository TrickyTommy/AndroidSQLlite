package com.example.androidmysqlite.repositories.local.databases

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class LocalDatabase(context: Context) :SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){
    companion object {
        private const val DATABASE_NAME = "local.db"
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

}