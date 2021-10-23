package com.example.notifikasi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Calendar(
    val imgCalendar: Int,
    val nameCalendar: String,
    val descCalendar: String,
) : Parcelable

annotation class Parcelize
