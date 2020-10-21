package com.dicoding.dicodingsubmission

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(){
    private lateinit var rvLanguage: RecyclerView
    private var list: ArrayList<Language> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Mengenal Bahasa Pemrograman"

        rvLanguage = findViewById(R.id.rv_language)
        rvLanguage.setHasFixedSize(true)

        list.addAll(LanguageData.listData)
        showRecycleList()
    }

    private fun moveToDetail(lang: Language) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.TITLE, lang.name)
        moveWithDataIntent.putExtra(DetailActivity.DESC, lang.description)
        moveWithDataIntent.putExtra(DetailActivity.IMG, lang.image)
        startActivity(moveWithDataIntent)
    }

    private fun showRecycleList(){
        rvLanguage.layoutManager = LinearLayoutManager(this)
        val languageAdapter = LanguageAdapter(list)
        rvLanguage.adapter = languageAdapter

        languageAdapter.setOnItemClickCallback(object : OnItemClickCallback {
            override fun onItemClicked(data: Language) {
                moveToDetail(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveAbout = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveAbout)
        return super.onOptionsItemSelected(item)
    }
}