package com.hnam.week4sample.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hnam.week4sample.R
import kotlinx.android.synthetic.main.fragment_1.*

/**
 * Created by nampham on 5/10/20.
 */

class FragmentA : BaseFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(getLoggerTag(), "onCreateView")
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun getLoggerTag(): String {
        return FragmentA::class.java.simpleName
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_1.setOnClickListener {
            (activity as DemoFragmentActivity).moveFragB()
        }
    }
}