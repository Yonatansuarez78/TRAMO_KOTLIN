package com.inovation.tramo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityTerminosCondicionesBinding

class TerminosCondicionesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerminosCondicionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerminosCondicionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()

        setSupportActionBar(binding.toolbarTerminosCondiciones)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}