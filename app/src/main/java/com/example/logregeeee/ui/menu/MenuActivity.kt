package com.example.logregeeee.ui.menu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.logregeeee.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get user email from intent
        val userEmail = intent.getStringExtra("USER_EMAIL")
        binding.welcomeText.text = "Welcome, $userEmail!"
    }
} 