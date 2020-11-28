package com.example.myapplication

import com.example.myapplication.dominio.User
import retrofit2.Call
import retrofit2.http.GET


interface API {
    @GET("users")
    fun obterUsuarios(): Call<List<User?>?>?


}
