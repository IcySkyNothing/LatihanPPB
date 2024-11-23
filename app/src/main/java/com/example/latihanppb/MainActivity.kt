package com.latihanexplicitintent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.latihanppb.MainActivity2
import com.example.latihanppb.R

class MainActivity : Activity(), View.OnClickListener {
    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<View>(R.id.button1) as Button
        button!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // Explicit Intent untuk pindah ke MainActivity2
        val explicitIntent = Intent(
            this@MainActivity,
            MainActivity2::class.java
        )
        startActivity(explicitIntent)
    }
}