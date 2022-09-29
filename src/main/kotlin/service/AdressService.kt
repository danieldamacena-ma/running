package service

import model.Adress
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AdressService {
    @GET("/ws/{cep}/json")
    fun getAdress(@Path("cep") cep:String)
    : Call<Adress>

}