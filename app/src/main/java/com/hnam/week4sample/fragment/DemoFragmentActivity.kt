package com.hnam.week4sample.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hnam.week4sample.R

class DemoFragmentActivity : AppCompatActivity(), FragmentA.FragACallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_fragment)

        if (supportFragmentManager.backStackEntryCount == 0){
            val fragA  = FragmentA()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragA)
                .commit()
        }

    }



    fun moveFragC(){
        val frag  = FragmentC()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, frag)
            .addToBackStack(null)
            .commit()
    }

    override fun moveToFragB() {
        val frag  = FragmentB()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, frag, FragmentB::class.java.simpleName)
            .addToBackStack(null)
            .commit()
    }

    override fun sendData(email: String, age: Int) {
        Toast.makeText(this, "$email + $age", Toast.LENGTH_SHORT).show()
    }


}
