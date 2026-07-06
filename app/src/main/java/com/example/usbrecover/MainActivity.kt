package com.example.usbrecover

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var statusView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        statusView = findViewById(R.id.statusView)
        findViewById<Button>(R.id.scanBtn).setOnClickListener {
            statusView.text = "Scan pressed. Connect OTG drive and use a full app later."
        }
    }
}