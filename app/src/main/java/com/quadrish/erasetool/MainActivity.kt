package com.quadrish.erasetool

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create a object of custom view
        val myCustomView = EraseTool(this@MainActivity)

        //Get root layout of the activity
        val rootLayout = findViewById<RelativeLayout>(R.id.mainLayout)

        //Add custom view into root layout
        rootLayout.addView(myCustomView)
    }
}