package com.inovation.tramo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrConductor10Binding
import com.inovation.tramo.databinding.ActivityIrConductorFinalBinding

class IrConductorActivityFinal : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductorFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductorFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductorFinal)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}