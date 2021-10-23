package com.example.notifikasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter (private val context: Context, private val Calendar : List<Calendar>, val listener: (Calendar) -> Unit)
    : RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>(){

    class CalendarViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgCalendar = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameCalendar = view.findViewById<TextView>(R.id.tv_item_name)
        val descCalendar = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(calendar: Calendar, listener: (Calendar) -> Unit) {
            imgCalendar.setImageResource(calendar.imgCalendar)
            nameCalendar.text = calendar.nameCalendar
            descCalendar.text = calendar.descCalendar
            itemView.setOnClickListener{
                listener(Calendar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        return CalendarViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_biodata, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.bindView(Calendar[position], listener)
    }

    override fun getItemCount(): Int = Calendar.size
}