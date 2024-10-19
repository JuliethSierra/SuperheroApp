package com.example.superheroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superheroapp.databinding.ActivityFriendsBinding
import com.example.superheroapp.ui.screens.superhero.rv.FriendsAdapter

class FriendsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFriendsBinding
    private lateinit var friendsAdapter: FriendsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFriendsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val friendsNames = intent.getStringArrayListExtra("FRIENDS_LIST") ?: arrayListOf()

        friendsAdapter = FriendsAdapter().apply {
            this.friends = friendsNames
        }

        binding.rvFriends.apply {
            layoutManager = LinearLayoutManager(this@FriendsActivity)
            adapter = friendsAdapter
        }
    }
}
