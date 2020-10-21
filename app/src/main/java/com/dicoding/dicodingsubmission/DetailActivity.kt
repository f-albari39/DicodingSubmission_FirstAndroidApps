package com.dicoding.dicodingsubmission

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {

    companion object{
        const val TITLE = "Title"
        const val DESC = "Desc"
        const val IMG = ""
    }

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        title = "Detail Bahasa"

        var clicked = 0

        val tvTitle : TextView = findViewById(R.id.detail_title)
        val tvDesc : TextView = findViewById(R.id.detail_description)
        val tvImg : ImageView = findViewById(R.id.detail_img)

        val title = intent.getStringExtra(TITLE)
        val desc = "\t\t\t"+intent.getStringExtra(DESC)
        val img = intent.getIntExtra(IMG,0)

        tvTitle.text = title
        tvDesc.text = desc
        tvImg.setImageResource(img)

        val btnFavorite : Button = findViewById(R.id.detail_btn_favorite)
        btnFavorite.setOnClickListener {
            clicked = if (clicked == 0){
                btnFavorite.setBackgroundColor(btnFavorite.context.resources.getColor(R.color.colorPrimary))
                btnFavorite.setTextColor(btnFavorite.context.resources.getColor(R.color.colorWhite))
                Toast.makeText(btnFavorite.context, "Ditambahkan ke Favorit",Toast.LENGTH_SHORT).show()
                1
            }else{
                btnFavorite.setBackgroundColor(btnFavorite.context.resources.getColor(R.color.colorAccent))
                btnFavorite.setTextColor(btnFavorite.context.resources.getColor(R.color.colorPrimary))
                Toast.makeText(btnFavorite.context, "Dikeluarkan dari Favorit",Toast.LENGTH_SHORT).show()
                0
            }
        }
    }
}