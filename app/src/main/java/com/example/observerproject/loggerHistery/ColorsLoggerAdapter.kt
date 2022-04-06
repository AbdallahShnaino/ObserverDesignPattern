package com.example.observerproject.loggerHistery

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.observerproject.R


class ColorsLoggerAdapter (var dataSet : ArrayList<String>)  :
    RecyclerView.Adapter<ColorsLoggerAdapter.ViewHolder>() {



    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView

        init {
            name = view.findViewById(R.id.nameTv)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.color_logger_layout, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.name.text = "Color Changed To [ "+dataSet[position]+" ]"

    }

    override fun getItemCount() = dataSet.size




}


