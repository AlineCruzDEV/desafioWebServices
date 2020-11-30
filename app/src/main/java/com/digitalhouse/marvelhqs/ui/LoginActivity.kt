package com.digitalhouse.marvelhqs.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cvWelcome.cvDadosLogin.btnLogin.setOnClickListener {
            callHome()
        }

        binding.cvWelcome.cvDadosLogin.tvCreateAccout.setOnClickListener {
            callRegister()
        }

    }

    private fun callRegister() {
        var intent = Intent(application, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun callHome() {
        finishAffinity()
        var intent = Intent(application, HomeActivity::class.java)
        startActivity(intent)
    }
}


