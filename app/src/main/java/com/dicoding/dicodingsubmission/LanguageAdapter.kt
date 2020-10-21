package com.dicoding.dicodingsubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class LanguageAdapter(private val languageList: ArrayList<Language>) : RecyclerView.Adapter<LanguageHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_page, parent, false)
        return LanguageHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageHolder, position: Int) {
        val lang = languageList[position]
        Glide.with(holder.itemView.context)
            .load(lang.image)
            .apply(RequestOptions().override(100,100))
            .into(holder.imgPhoto)
        holder.tvName.text = lang.name
        holder.tvDescription.text  = lang.description
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(languageList[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return languageList.size
    }

}