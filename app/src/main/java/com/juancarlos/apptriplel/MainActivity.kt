package com.juancarlos.apptriplel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.juancarlos.apptriplel.models.Proyecto
import com.juancarlos.apptriplel.models.RequestTiendasUsuario
import com.juancarlos.apptriplel.models.ResponseTiendasUsuario
import com.juancarlos.apptriplel.models.Usuario
import com.juancarlos.apptriplel.service.ApiAdapterService
import com.juancarlos.apptriplel.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getConjuntotiendasUsuario()
    }

    fun getConjuntotiendasUsuario(){

    }
}
