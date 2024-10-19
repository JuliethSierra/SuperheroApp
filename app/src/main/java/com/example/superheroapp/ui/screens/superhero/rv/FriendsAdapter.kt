package com.example.superheroapp.ui.screens.superhero.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.databinding.FriendViewBinding

class FriendsAdapter : RecyclerView.Adapter<FriendViewHolder>() {

    var friends = listOf<String>() // Lista de nombres

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val binding = FriendViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FriendViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.bind(friends[position])
    }

    override fun getItemCount(): Int = friends.size
}

class FriendViewHolder(private val binding: FriendViewBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(friendName: String) {
        binding.tvFriendName.text = friendName
    }
}
