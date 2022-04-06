package com.example.observerproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.observerproject.EventListener.EventListener

class BackgroundColorChangeActivity : AppCompatActivity() , EventListener.ColorChangingListener{
     companion object{
         var color = Color.WHITE
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background_color_change)
        var backgroundView : View = findViewById(R.id.backgroundView)
        backgroundView.setBackgroundColor(color)
    }


    override fun getUpdates(message: String) {

        Log.d("aaaaa" , message)
        if (message == "red")
            color = Color.RED

        if (message == "green")
            color = Color.GREEN


        if (message == "blue")
            color = Color.BLUE

    }
}