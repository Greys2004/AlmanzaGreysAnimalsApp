package com.example.almanzagreysanimalsapp.services

import com.example.almanzagreysanimalsapp.models.Animal
import com.example.almanzagreysanimalsapp.models.apiAnimales
import retrofit2.http.GET

interface animalesServie {
    //EndPoint
    @GET("Animals")
    suspend fun getAnimales(): List<Animal>
}