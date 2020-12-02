package com.digitalhouse.marvelhqs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.databinding.ActivityDetalheHqBinding

class DetalheHQActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheHqBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheHqBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarDetalhe)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}