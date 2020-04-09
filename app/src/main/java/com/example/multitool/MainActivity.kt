package com.example.multitool

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_enter_pin_code.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()


    }

    private fun initListener() {
        button_app_hider.setOnClickListener { openDialogPinCode() }

    }
    private fun openDialogPinCode(){
       val dialog = Dialog(this@MainActivity)
        dialog.setContentView(R.layout.activity_enter_pin_code)
        dialog.show()
    }


}