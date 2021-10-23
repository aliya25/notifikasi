package com.example.notifikasi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotifikasiAdapter (private val context: Context, private val Notifikasi : List<Notifikasi>, val listener: (Notifikasi) -> Unit)
    : RecyclerView.Adapter<NotifikasiAdapter.NotifikasiViewHolder>(){

    class NotifikasiViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgNotifikasi = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameNotifikasi = view.findViewById<TextView>(R.id.tv_item_name)
        val descNotifikasi = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(notifikasi: Notifikasi, listener: (Notifikasi) -> Unit) {
            imgNotifikasi.setImageResource(notifikasi.imgNotifikasi)
            nameNotifikasi.text = notifikasi.nameNotifikasi
            descNotifikasi.text = notifikasi.descNotifikasi
            itemView.setOnClickListener{
                listener(Notifikasi)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifikasiAdapter.NotifikasiViewHolder {
        return NotifikasiAdapter.NotifikasiViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_biodata, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NotifikasiAdapter.NotifikasiViewHolder, position: Int) {
        holder.bindView(Notifikasi[position], listener)
    }

    override fun getItemCount(): Int = Notifikasi.size
}