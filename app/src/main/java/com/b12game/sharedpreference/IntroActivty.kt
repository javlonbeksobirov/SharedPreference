package com.b12game.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivty : AppCompatActivity() {
    lateinit var save_btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_activty)
        initViews()
    }

    private fun initViews() {
        save_btn = findViewById(R.id.save_btn)
        save_btn.setOnClickListener {
            SharedPref(this).isSaved(true)
        }
    }
}