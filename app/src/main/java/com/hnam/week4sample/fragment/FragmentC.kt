package com.hnam.week4sample.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hnam.week4sample.R

/**
 * Created by nampham on 5/10/20.
 */

class FragmentC : BaseFragment(){

    override fun getLoggerTag(): String {
        return FragmentC::class.java.simpleName
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(getLoggerTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_3, container, false)
    }


}