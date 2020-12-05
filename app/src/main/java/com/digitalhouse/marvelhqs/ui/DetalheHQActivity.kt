package com.digitalhouse.marvelhqs.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.digitalhouse.marvelhqs.databinding.ActivityDetalheHqBinding
import com.digitalhouse.marvelhqs.entities.HQ
import com.squareup.picasso.Picasso

class DetalheHQActivity() : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheHqBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheHqBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbarDetalhe)

        val hq = intent.getSerializableExtra("hq") as HQ

        Log.i("DetalheHQ",hq.title.toString())

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.includeDetalheDados.tvDetalheTitulo.text = hq.title
        binding.includeDetalheDados.tvDetalheSinopse.text = hq.description
        binding.includeDetalheDados.tvDetalhePublished.text = hq.dates[0].toString()
        binding.includeDetalheDados.tvDetalhePrice.text = hq.prices[0].toString()
        binding.includeDetalheDados.tvDetalhePages.text = hq.pageCount.toString()

        Picasso.get().load(hq.thumbnail.toString())
            .into(binding.ivDetalheHQ)

        Picasso.get().load(hq.images[0].toString())
            .into(binding.ivDetalheCapa)

        binding.ivDetalheHQ.setOnClickListener {
            var intent = Intent(application, CapaHQActivity::class.java)
            intent.putExtra("hq", hq)
            startActivity(intent)
        }
    }


}