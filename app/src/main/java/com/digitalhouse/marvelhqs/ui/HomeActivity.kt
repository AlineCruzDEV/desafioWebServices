package com.digitalhouse.marvelhqs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.adapter.HQAdapter
import com.digitalhouse.marvelhqs.databinding.ActivityHomeBinding
import com.digitalhouse.marvelhqs.entities.HQ

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val recyclerView = binding.rvHomeQuadrinho

        recyclerView.adapter = HQAdapter(listOf(HQ("#98"), HQ("#99"), HQ("#100"), HQ("#101"), HQ("#102"), HQ("#103"), HQ("#104"), HQ("#105"), HQ("#106"), HQ("#107")), this)
        recyclerView.layoutManager = GridLayoutManager(this,3)

    }
}