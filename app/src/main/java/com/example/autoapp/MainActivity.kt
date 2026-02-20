package com.example.autoapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this)
        text.text = "This app works with Android Auto.\n\nConnect your phone to your car via USB to get started."
        text.textSize = 18f
        text.setPadding(64, 64, 64, 64)
        setContentView(text)
    }
}
