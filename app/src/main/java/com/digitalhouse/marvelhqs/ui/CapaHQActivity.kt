package com.digitalhouse.marvelhqs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.marvelhqs.databinding.ActivityCapaHqBinding
import com.digitalhouse.marvelhqs.databinding.ActivityDetalheHqBinding

class CapaHQActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCapaHqBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapaHqBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarCapaHQ)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}