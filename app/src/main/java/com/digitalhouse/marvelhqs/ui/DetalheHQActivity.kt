package com.digitalhouse.marvelhqs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.marvelhqs.databinding.ActivityDetalheHqBinding
import com.digitalhouse.marvelhqs.entities.HQ
import com.squareup.picasso.Picasso

class DetalheHQActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheHqBinding

    var hq = intent.getSerializableExtra("hq") as HQ

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheHqBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarDetalhe)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.includeDetalheDados.tvDetalheTitulo.text = hq.title

//        Picasso.get().load(hq.thumbnail.toString())
//            .into(binding.ivDetalheHQ)

        binding.ivDetalheHQ.setOnClickListener {
            callCapa()
        }
    }

    private fun callCapa() {
        var intent = Intent(application, CapaHQActivity::class.java)
        startActivity(intent)
    }
}