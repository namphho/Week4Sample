package com.hnam.week4sample.parcel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by nampham on 5/15/20.
 */
@Parcelize
data class Student(val name: String, val age: Int) : Parcelable