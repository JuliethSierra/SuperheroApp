package com.example.superheroapp.ui.screens.superhero.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.data.models.Superhero
import com.example.superheroapp.databinding.SuperheroViewBinding


class RVSuperheroAdapter : RecyclerView.Adapter<SuperheroViewHolder>() {

    private var superheroesList = emptyList<Superhero>()

    // Método para actualizar la lista de superhéroes
    fun setSuperheroes(newSuperheroes: List<Superhero>) {
        this.superheroesList = newSuperheroes
        notifyDataSetChanged() // Asegúrate de notificar cambios
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val binding = SuperheroViewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return SuperheroViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bind(superheroesList[position])
    }

    override fun getItemCount() = superheroesList.size
}

