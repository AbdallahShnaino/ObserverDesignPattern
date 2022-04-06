package com.example.observerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.observerproject.EventListener.EventListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listner = EventListener.getInstance()
        listner.register(BackgroundColorChangeActivity())
        listner.register(LoggerActivity())


        var colorPickerBtn = findViewById<Button>(R.id.colorPickerBtn)
        var loggerBtn = findViewById<Button>(R.id.loggerBtn)
        var backgroundColorChangeBtn = findViewById<Button>(R.id.backgroundColorChangeBtn)

        colorPickerBtn.setOnClickListener {
            var intent = Intent(this , ColorPickerActivity::class.java)
            startActivity(intent)
        }
        loggerBtn.setOnClickListener {
            var intent = Intent(this , LoggerActivity::class.java)
            startActivity(intent)
        }
        backgroundColorChangeBtn.setOnClickListener {
            var intent = Intent(this , BackgroundColorChangeActivity::class.java)
            startActivity(intent)
        }


    }
}