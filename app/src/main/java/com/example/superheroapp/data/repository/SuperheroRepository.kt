package com.example.superheroapp.data.repository

import com.example.superheroapp.data.generateSuperheroes
import com.example.superheroapp.data.models.Superhero
import javax.inject.Inject

class SuperheroRepository @Inject constructor() {
    fun getSuperheroes(): List<Superhero> = generateSuperheroes()
}