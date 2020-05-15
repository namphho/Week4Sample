package com.hnam.week4sample.parcel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by nampham on 5/15/20.
 */
@Parcelize
class Account(val email: String, val fullName: String) : Parcelable {
}