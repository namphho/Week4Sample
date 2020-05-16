package com.hnam.week4sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.hnam.week4sample.activity.ActivityA
import com.hnam.week4sample.dialog.LoginDialog
import com.hnam.week4sample.fragment.DemoFragmentActivity
import com.hnam.week4sample.parcel.Account
import com.hnam.week4sample.parcel.ParcelActivity
import com.hnam.week4sample.parcel.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_activity.setOnClickListener {
            val i = Intent(this, ActivityA::class.java)
            startActivity(i)
        }
        btn_fragment.setOnClickListener{
            val i = Intent(this, DemoFragmentActivity::class.java)
            startActivity(i)
        }
        btn_dialog_fragment.setOnClickListener {
            //to do something
            val dialog = LoginDialog()
            dialog.show(supportFragmentManager, LoginDialog::class.java.simpleName)
        }

        btn_parcel.setOnClickListener {
            //tod do something
            val i = Intent(this, ParcelActivity::class.java)
            val bundle = Bundle()
            bundle.putParcelable("Student", Student("John", 30));
            bundle.putParcelable("Account", Account("Tony", "tony@gmail.com"))
            i.putExtras(bundle)
            startActivity(i)
        }
    }
}
