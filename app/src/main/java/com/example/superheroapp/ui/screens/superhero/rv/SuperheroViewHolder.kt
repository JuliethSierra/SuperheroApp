package com.example.superheroapp.ui.screens.superhero.rv

import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.data.models.Superhero
import com.example.superheroapp.databinding.SuperheroViewBinding

class SuperheroViewHolder(
    private val binding: SuperheroViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(superhero: Superhero) {
        binding.tvCharacterName.text = superhero.name
        binding.ivCharacterPicture.setImageResource(superhero.photo)
        binding.idCharacter.text = superhero.id.toString()
    }
}