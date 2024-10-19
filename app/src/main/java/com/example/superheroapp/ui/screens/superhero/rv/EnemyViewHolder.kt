package com.example.superheroapp.ui.screens.superhero.rv

import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.data.models.Enemy
import com.example.superheroapp.databinding.EnemyViewBinding

class EnemyViewHolder(private val binding: EnemyViewBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(enemy: Enemy) {
        binding.tvEnemyName.text = enemy.name
        binding.ivEnemyPicture.setImageResource(enemy.photo)
    }
}