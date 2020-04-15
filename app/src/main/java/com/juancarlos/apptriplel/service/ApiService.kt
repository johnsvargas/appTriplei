package com.juancarlos.apptriplel.service


import com.juancarlos.apptriplel.models.RequestTiendasUsuario
import com.juancarlos.apptriplel.models.ResponseTiendasUsuario
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("getConjuntotiendasUsuario")
    fun getConjuntotiendasUsuario(@Body body:RequestTiendasUsuario): Call<ResponseTiendasUsuario>
}