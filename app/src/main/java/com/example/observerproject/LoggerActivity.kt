package com.example.observerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.observerproject.EventListener.EventListener
import com.example.observerproject.loggerHistery.ColorsLoggerAdapter

class LoggerActivity : AppCompatActivity() , EventListener.ColorChangingListener {
    companion object{
        var array = ArrayList<String>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logger)
        var adapter = ColorsLoggerAdapter(array)
        var tv = findViewById<RecyclerView>(R.id.recyclerViewLogging)
        tv.adapter = adapter
        tv.layoutManager = LinearLayoutManager(this)
    }

    override fun getUpdates(message: String) {
        array.add(message)
        Log.d("aaaaa" , message)
    }
}