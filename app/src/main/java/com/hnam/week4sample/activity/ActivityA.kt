package com.hnam.week4sample.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hnam.week4sample.R
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : AppCompatActivity() {

    companion object{
        const val KEY_DATA = "data"
        const val KEY_REQUEST = 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btn_start_activity.setOnClickListener {
            val i = Intent(this, ActivityB::class.java)
            val bundle = Bundle()
            val data = editText.text.toString().trim()
            bundle.putString(KEY_DATA, data)
            i.putExtras(bundle)
            startActivity(i)
        }
    }
}
