package com.example.myapplication

import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.dominio.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buscaDados()
    }
    private fun buscaDados() {
        val serviceRetrofit = RetrofitService()
        serviceRetrofit.api?.obterUsuarios()?.enqueue(object : Callback<List<User?>?> {
            override fun onResponse(call: Call<List<User?>?>?, response: Response<List<User?>?>?) {
                val lista = response?.body();
                text1.setText(lista?.get(0)?.name)
                text2.setText(lista?.get(1)?.name)
                text3.setText(lista?.get(2)?.name)
                text4.setText(lista?.get(3)?.name)
                text5.setText(lista?.get(4)?.name)
                text6.setText(lista?.get(5)?.name)
                text7.setText(lista?.get(6)?.name)
                text8.setText(lista?.get(7)?.name)
                text9.setText(lista?.get(8)?.name)
                text10.setText(lista?.get(9)?.name)
            }

            override fun onFailure(call: Call<List<User?>?>, t: Throwable) {
                Log.e("Erro", "************** erro **********\n"+t.message.toString())
            }
        })
    }

}