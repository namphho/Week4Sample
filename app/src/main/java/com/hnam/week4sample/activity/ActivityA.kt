package com.hnam.week4sample.activity

import android.app.Activity
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
        btn_start_activity_result.setOnClickListener {
            val i = Intent(this@ActivityA, ActivityB::class.java)
            startActivityForResult(i, KEY_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == KEY_REQUEST){
            //action for activity B
            if (resultCode == Activity.RESULT_OK){
                val bundle = data?.extras
                bundle?.let {
                    val text = it.getString("FROM_B")
                    tv_received.text = text
                }
            }
        }
    }
}
