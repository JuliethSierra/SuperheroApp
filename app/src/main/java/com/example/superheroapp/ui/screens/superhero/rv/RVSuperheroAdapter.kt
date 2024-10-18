package com.example.superheroapp.ui.screens.superhero.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.data.models.Superhero
import com.example.superheroapp.databinding.SuperheroViewBinding

class RVSuperheroAdapter(

) : RecyclerView.Adapter<SuperheroViewHolder>() {

    var superhero = emptyList<Superhero>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val binding = SuperheroViewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return SuperheroViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bind(superhero[position])
    }

    override fun getItemCount() = superhero.size

}
