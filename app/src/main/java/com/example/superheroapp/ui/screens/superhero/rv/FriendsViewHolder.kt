package com.example.superheroapp.ui.screens.superhero.rv

import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.databinding.FriendViewBinding

class FriendsViewHolder(
    private val binding: FriendViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(friendId: Int) {
        binding.tvFriendName.text = getFriendNameById(friendId)
    }

    private fun getFriendNameById(id: Int): String {
        return "Amigo $id"
    }
}