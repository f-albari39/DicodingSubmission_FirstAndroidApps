package com.dicoding.dicodingsubmission

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageHolder(view: View): RecyclerView.ViewHolder(view){
    var tvName: TextView = itemView.findViewById(R.id.list_title)
    var tvDescription: TextView = itemView.findViewById(R.id.list_description)
    var imgPhoto: ImageView = itemView.findViewById(R.id.list_img)
}