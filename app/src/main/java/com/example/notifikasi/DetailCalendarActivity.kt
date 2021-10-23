package com.example.notifikasi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailCalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_biodata)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val biodata = intent.getParcelableExtra<Calendar>(MainActivity.INTENT_PARCELABLE)

        val imgCalendar = findViewById<ImageView>(R.id.img_item_photo)
        val nameCalendar = findViewById<TextView>(R.id.tv_item_name)
        val descCalendar = findViewById<TextView>(R.id.tv_item_description)

        imgCalendar.setImageResource(biodata?.imgCalendar!!)
        nameCalendar.text = biodata.nameCalendar
        descCalendar.text = biodata.descCalendar

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}