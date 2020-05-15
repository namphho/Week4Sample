package com.hnam.week4sample.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hnam.week4sample.R

class DemoFragmentActivity : AppCompatActivity() {

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

    fun moveFragB() {
        val frag  = FragmentB()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, frag, FragmentB::class.java.simpleName)
            .addToBackStack(null)
            .commit()
    }

    fun moveFragC(){
        val frag  = FragmentC()
        val fragB = supportFragmentManager.findFragmentByTag(FragmentB::class.java.simpleName)
        fragB?.let {
            supportFragmentManager.beginTransaction().remove(fragB).commit()
            supportFragmentManager.popBackStack()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, frag)
            .addToBackStack(null)
            .commit()
    }


}
