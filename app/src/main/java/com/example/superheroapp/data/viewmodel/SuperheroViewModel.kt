package com.example.superheroapp.data.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.superheroapp.data.models.Superhero
import com.example.superheroapp.data.repository.SuperheroRepository
import com.example.superheroapp.ui.screens.superhero.uistate.SuperheroUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SuperheroViewModel @Inject constructor(
    private val repository: SuperheroRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(SuperheroUIState())
    val uiState: StateFlow<SuperheroUIState> = _uiState.asStateFlow()

    init {
        loadSuperheroes()
    }

    private fun loadSuperheroes() {
        val superheroes: List<Superhero> = repository.getSuperheroes()
        Log.d("AndroidRuntime", superheroes.toString())
        _uiState.value = _uiState.value.copy(superheros = superheroes,
            isLoading = false)
    }
}

