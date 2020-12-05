package com.digitalhouse.marvelhqs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.databinding.ActivityHomeBinding
import com.digitalhouse.marvelhqs.entities.HQ
import com.digitalhouse.marvelhqs.service.service
import com.digitalhouse.marvelhqs.viewModel.MainViewModel
import com.digitalhouse.marvelhqs.adapter.HQAdapter as HQAdapter

class HomeActivity : AppCompatActivity() {

    var hqs = ArrayList<HQ>()

    private lateinit var binding: ActivityHomeBinding

    val viewModel by viewModels<MainViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(service) as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val recyclerView = binding.rvHomeQuadrinho
        recyclerView.layoutManager = GridLayoutManager(this,3)

        viewModel.getHQsMiranha()
        viewModel.listaHQs.observe(this){
            recyclerView.adapter = HQAdapter(it,this)
        }

    }
}