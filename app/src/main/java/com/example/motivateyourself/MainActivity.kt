package com.example.motivateyourself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.adapter.ItemAdapter
import com.example.motivateyourself.data.Datasource
import com.example.motivateyourself.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataSet = Datasource().loadAffirmations()
        var recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, dataSet)

        recyclerView.setHasFixedSize(true)
    }
}