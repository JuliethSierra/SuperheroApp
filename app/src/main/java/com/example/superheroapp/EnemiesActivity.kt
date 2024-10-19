package com.example.superheroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superheroapp.data.models.Enemy
import com.example.superheroapp.databinding.ActivityEnemiesBinding
import com.example.superheroapp.ui.screens.superhero.rv.EnemiesAdapter

class EnemiesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEnemiesBinding
    private lateinit var enemiesAdapter: EnemiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEnemiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val enemies = intent.getParcelableArrayListExtra<Enemy>("ENEMIES_LIST") ?: arrayListOf()

        enemiesAdapter = EnemiesAdapter().apply {
            this.enemies = enemies
        }

        binding.rvEnemies.apply {
            layoutManager = LinearLayoutManager(this@EnemiesActivity)
            adapter = enemiesAdapter
        }
    }

}