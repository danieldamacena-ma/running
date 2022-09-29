package config

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import service.AdressService

fun viaCepConfig(): AdressService {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://viacep.com.br")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    return retrofit.create(AdressService::class.java)
}