package com.hnam.week4sample.activity

import android.app.Activity
import android.content.Intent
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

        btn_send_back.setOnClickListener {
            val text = edt_send_back.text.toString().trim()
            val intent = Intent()
            val bundle = Bundle()
            bundle.putString("FROM_B", text)
            intent.putExtras(bundle)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
