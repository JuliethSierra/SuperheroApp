package com.example.superheroapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superheroapp.data.viewmodel.SuperheroViewModel
import com.example.superheroapp.databinding.ActivityMainBinding
import com.example.superheroapp.ui.screens.superhero.rv.RVSuperheroAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: SuperheroViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvSuperheroAdapter: RVSuperheroAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvSuperheroAdapter = RVSuperheroAdapter()

        initRV()
        initUiStateLifecycle()
    }

    private fun initRV() {
        binding.rvCharacters.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = rvSuperheroAdapter
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initUiStateLifecycle() {
        lifecycleScope.launch {
            viewModel.uiState.collect { uiState ->
                uiState.superheros?.let { listSuperhero ->
                    rvSuperheroAdapter.superhero = listSuperhero
                    rvSuperheroAdapter.notifyDataSetChanged()
                }
                binding.rvCharacters.visibility = if (uiState.isLoading) View.INVISIBLE else View.VISIBLE
                binding.pbCharacters.visibility = if (uiState.isLoading.not()) View.INVISIBLE else View.VISIBLE
            }
        }
    }
}