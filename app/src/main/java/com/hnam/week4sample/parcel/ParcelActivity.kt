package com.hnam.week4sample.parcel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hnam.week4sample.R

class ParcelActivity : AppCompatActivity() {
    companion object {
        private val TAG = ParcelActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcel)
        val bundle = intent.extras
        bundle?.let {
            val student = it.getParcelable("Student") as? Student
            val account = it.getParcelable("Account") as? Account
            Log.e(TAG, "student= $student")
            Log.e(TAG, "Account= $account")
        }
    }
}
