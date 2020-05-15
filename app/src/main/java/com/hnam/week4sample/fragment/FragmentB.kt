package com.hnam.week4sample.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hnam.week4sample.R
import kotlinx.android.synthetic.main.fragment_2.*

/**
 * Created by nampham on 5/10/20.
 */

class FragmentB : BaseFragment(){
    var count = 0
    override fun getLoggerTag(): String {
        return FragmentB::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState?.let {
            count = it.getInt("data")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(getLoggerTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = count.toString()
        btnCount.setOnClickListener {
            count++
            textView.text = count.toString()
        }
        btnToFragC.setOnClickListener {
            (activity as DemoFragmentActivity).moveFragC()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("data", count)
        super.onSaveInstanceState(outState)

    }
}