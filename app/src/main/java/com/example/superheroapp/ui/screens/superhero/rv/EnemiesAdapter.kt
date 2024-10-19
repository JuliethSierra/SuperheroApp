package com.example.superheroapp.ui.screens.superhero.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.data.models.Enemy
import com.example.superheroapp.databinding.EnemyViewBinding

class EnemiesAdapter : RecyclerView.Adapter<EnemyViewHolder>() {

    var enemies = listOf<Enemy>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnemyViewHolder {
        val binding = EnemyViewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return EnemyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EnemyViewHolder, position: Int) {
        holder.bind(enemies[position])
    }

    override fun getItemCount(): Int = enemies.size
}
