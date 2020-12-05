package com.digitalhouse.marvelhqs.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.digitalhouse.marvelhqs.entities.HQ
import com.digitalhouse.marvelhqs.service.Service
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.launch

class MainViewModel(val service: Service): ViewModel() {

    var listaHQs = MutableLiveData<ArrayList<HQ>>()

    fun getHQsMiranha(){
        viewModelScope.launch {
            try{
                val resp = service.getHQsMiranha(
                    10,
                    1,
                    "1",
                    "92a920e201edc6de922ef3922b1d6f03",
                    "5258e22859de0f20b3f043e9ef617ba5"
                )

                val results = resp.get("data").asJsonObject.get("results")
                val hqs = Gson().fromJson(
                    results,
                    object : TypeToken<List<HQ>>() {}.type
                ) as ArrayList<HQ>

                listaHQs.value = hqs

                hqs.forEach{
                    Log.i("MainViewModeldeHQ", it.title).toString()
                }

            }catch (e: Exception){
                Log.i("MainViewModel", e.toString())
            }
        }
    }
}