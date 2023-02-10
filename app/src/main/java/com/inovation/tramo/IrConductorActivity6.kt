package com.inovation.tramo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrConductor6Binding

class IrConductorActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor6)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}