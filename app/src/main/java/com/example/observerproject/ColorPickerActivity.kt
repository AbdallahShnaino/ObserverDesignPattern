package com.example.observerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.observerproject.EventListener.EventListener

class ColorPickerActivity : AppCompatActivity() , EventListener.ColorChangingListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_picker)

        var redBtn = findViewById<Button>(R.id.red)
        var greenBtn = findViewById<Button>(R.id.green)
        var blueBtn = findViewById<Button>(R.id.blue)
        var listener = EventListener.getInstance()
        listener.register(this)
        redBtn.setOnClickListener {
            listener.sendMessage("red")
        }
        greenBtn.setOnClickListener {
            listener.sendMessage("green")
        }
        blueBtn.setOnClickListener {
            listener.sendMessage("blue")
        }
    }

    override fun getUpdates(message: String) {
        // DO NOTHING !
    }


}