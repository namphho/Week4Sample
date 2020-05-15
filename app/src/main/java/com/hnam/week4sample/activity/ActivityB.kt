package com.hnam.week4sample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hnam.week4sample.R
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val bundle = intent.extras
        bundle?.let {
            val text = bundle.getString(ActivityA.KEY_DATA)
            tv_text.text = "Data is $text"
        }

    }
}
