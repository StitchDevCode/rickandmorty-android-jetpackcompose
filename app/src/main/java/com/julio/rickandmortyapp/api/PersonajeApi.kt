package com.julio.rickandmortyapp.api

import com.julio.rickandmortyapp.models.ListaPersonajes
import retrofit2.http.GET

interface PersonajeApi {
    @GET("character")
    suspend fun getPersonajes(): ListaPersonajes
}