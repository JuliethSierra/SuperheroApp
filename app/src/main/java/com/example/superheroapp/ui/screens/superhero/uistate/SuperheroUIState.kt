package com.example.superheroapp.ui.screens.superhero.uistate

import com.example.superheroapp.data.models.Superhero

data class SuperheroUIState(
    val superheros: List<Superhero>? = emptyList(),
    val isLoading: Boolean = true
)