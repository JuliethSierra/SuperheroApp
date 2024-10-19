package com.example.superheroapp.data.models

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Superhero(
    val id: Int,
    val name: String,
    val alterName: String,
    @DrawableRes val photo: Int,
    // List of Power ids
    val powers: List<Int>,
    // List of Superhero ids
    val friends: List<Friend>,
    val mainEnemy: Enemy,
    // List of Enemy ids
    val enemies: List<Enemy>,
    // List of Location ids
    val locations: List<Int>
): Serializable