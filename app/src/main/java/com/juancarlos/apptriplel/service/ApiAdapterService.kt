package com.juancarlos.apptriplel.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiAdapterService {
    var API_SERVICE : ApiService? = null

    val apiService: ApiService
        get() {
            if (API_SERVICE == null) {
                val interceptor = HttpLoggingInterceptor()
                interceptor.level = HttpLoggingInterceptor.Level.BODY
                val client = OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .build()
                val retrofit = Retrofit.Builder()
                    .client(client)
                    .baseUrl("http://www.webteam.mx/Demo/Tracker.Procesos.svc/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                API_SERVICE = retrofit.create(ApiService::class.java)
            }
            return API_SERVICE!!
        }
}