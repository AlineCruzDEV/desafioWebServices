package com.digitalhouse.marvelhqs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {


    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}