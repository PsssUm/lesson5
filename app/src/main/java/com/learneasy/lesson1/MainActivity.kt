package com.learneasy.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchBTN.setOnClickListener {
            Log.d("MainActivity", "searchET = ${searchET.text.toString()}")
            progressRL.visibility = View.VISIBLE
            val intent = Intent(this, TagsListActivity::class.java)
            intent.putExtra(Constants.USERNAME, searchET.text.toString())
            startActivity(intent)
        }
    }

}