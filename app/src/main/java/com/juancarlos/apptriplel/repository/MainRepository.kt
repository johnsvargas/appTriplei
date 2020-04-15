package com.juancarlos.apptriplel.repository

import android.util.Log
import com.juancarlos.apptriplel.models.Proyecto
import com.juancarlos.apptriplel.models.RequestTiendasUsuario
import com.juancarlos.apptriplel.models.ResponseTiendasUsuario
import com.juancarlos.apptriplel.models.Usuario
import com.juancarlos.apptriplel.service.ApiAdapterService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepository {
    fun getConjuntotiendasUsuario(){
        val tiendasUsuario = RequestTiendasUsuario(Usuario("11208"), Proyecto("137",0))
        ApiAdapterService.apiService.
        getConjuntotiendasUsuario(tiendasUsuario).enqueue(object :
            Callback<ResponseTiendasUsuario> {
            override fun onFailure(call: Call<ResponseTiendasUsuario>, t: Throwable) {
                Log.e("ErrorApi","Error")
            }

            override fun onResponse(call: Call<ResponseTiendasUsuario>, response: Response<ResponseTiendasUsuario>) {
                if(response.isSuccessful){

                }
            }

        })
    }
}