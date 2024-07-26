package com.julio.rickandmortyapp.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.julio.rickandmortyapp.models.Results
import com.julio.rickandmortyapp.repository.PersonajeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonajeViewModel @Inject constructor(
    private val personajeRepository: PersonajeRepository
): ViewModel(){
    private val _state = MutableStateFlow(emptyList<Results>())
        val state : StateFlow<List<Results>>
        get() = _state

    init {
        viewModelScope.launch {
            _state.value = personajeRepository.getPersonajes().results
        }
    }
}