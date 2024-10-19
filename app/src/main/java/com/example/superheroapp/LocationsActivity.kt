package com.example.superheroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superheroapp.databinding.ActivityLocationsBinding
import com.example.superheroapp.ui.screens.superhero.rv.LocationsAdapter

class LocationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocationsBinding
    private lateinit var locationsAdapter: LocationsAdapter // Adaptador para mostrar las ubicaciones

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val locationsList = intent.getStringArrayListExtra("LOCATIONS_LIST") ?: arrayListOf()

        setupRecyclerView(locationsList)
    }

    private fun setupRecyclerView(locations: List<String>) {
        locationsAdapter = LocationsAdapter(locations) // Asume que has creado un adaptador para manejar la lista
        binding.recyclerViewLocations.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewLocations.adapter = locationsAdapter
    }
}