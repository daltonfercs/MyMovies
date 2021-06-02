package com.daltonfercs.mymovies

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.daltonfercs.mymovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.showButton.setOnClickListener{
            val message = binding.messege.text
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }


    }
}