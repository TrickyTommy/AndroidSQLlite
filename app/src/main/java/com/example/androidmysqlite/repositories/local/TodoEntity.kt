package com.example.androidmysqlite.repositories.local

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TodoEntity(val id: Long, val task: String ): Parcelable{

    companion object {
        const val TABLE_NAME = "todo_table"
        const val COLUMN_ID ="id"
        const val  COLUMN_TASK = "task"
        const val SQL_CREATE_TODO = "CREATE TABLE $TABLE_NAME("+"" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT"

    }
}
