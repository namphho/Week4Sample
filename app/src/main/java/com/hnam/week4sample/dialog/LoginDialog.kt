package com.hnam.week4sample.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import com.hnam.week4sample.R

/**
 * Created by nampham on 5/15/20.
 */
class LoginDialog : DialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.login_dialog, container, true)
        return view
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val width = resources.getDimensionPixelSize(R.dimen.width_tutorial_dialog)
        val height = resources.getDimensionPixelSize(R.dimen.height_tutorial_dialog)
        dialog.window?.setLayout(width, height)
        return dialog
    }
}