package service

import model.Adress
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AdressService {
    @GET("/ws/{cep}/json")
//private Call<Address> getAddress(@Header("Authorization) String token, @Path("estadoAtuacao") String estado) {...}
    fun getAdress(@Path("cep") cep:String)
    : Call<Adress>

}