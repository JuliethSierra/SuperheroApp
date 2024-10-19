package com.example.superheroapp.ui.screens.superhero.rv

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.EnemiesActivity
import com.example.superheroapp.FriendsActivity
import com.example.superheroapp.PowersActivity
import com.example.superheroapp.data.generatePowers
import com.example.superheroapp.data.models.Superhero
import com.example.superheroapp.databinding.SuperheroViewBinding

class SuperheroViewHolder(
    private val binding: SuperheroViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(superhero: Superhero) {
        binding.tvCharacterName.text = superhero.name
        binding.ivCharacterPicture.setImageResource(superhero.photo)

        binding.btnPowers.setOnClickListener {
            val context = binding.root.context
            val powers = superhero.powers.map { powerId ->
                generatePowers().find { it.id == powerId }?.name ?: "Desconocido"
            }

            val intent = Intent(context, PowersActivity::class.java).apply {
                putExtra("POWERS_LIST", powers.toTypedArray())
            }
            context.startActivity(intent)
        }

        binding.btnFriends.setOnClickListener {
            val context = binding.root.context
            val friendsNames = superhero.friends.map { it.name }

            val intent = Intent(context, FriendsActivity::class.java)
            intent.putStringArrayListExtra("FRIENDS_LIST", ArrayList(friendsNames))
            context.startActivity(intent)
        }

        binding.btnEnemy.setOnClickListener {
            val context = binding.root.context
            val enemiesList = superhero.enemies
            val intent = Intent(context, EnemiesActivity::class.java).apply {
                putParcelableArrayListExtra("ENEMIES_LIST", ArrayList(enemiesList))
            }
            context.startActivity(intent)
        }
    }
}