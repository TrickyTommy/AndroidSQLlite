package com.example.androidmysqlite.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*


@Parcelize
data class TodoModels(val id: Long, val task: String) : Parcelable