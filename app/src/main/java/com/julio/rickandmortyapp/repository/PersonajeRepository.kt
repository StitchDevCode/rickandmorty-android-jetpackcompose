package com.julio.rickandmortyapp.repository

import com.julio.rickandmortyapp.api.PersonajeApi
import com.julio.rickandmortyapp.models.ListaPersonajes
import javax.inject.Inject

class PersonajeRepository @Inject constructor(
 private val personajeApi: PersonajeApi
) {
    suspend fun getPersonajes(): ListaPersonajes{
        return personajeApi.getPersonajes()
    }
}