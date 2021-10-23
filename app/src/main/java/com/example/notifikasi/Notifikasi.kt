package com.example.notifikasi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Notifikasi(
    val imgNotifikasi: Int,
    val nameNotifikasi: String,
    val descNotifikasi: String,
) : Parcelable

annotation class Parcelize
