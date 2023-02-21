package com.inovation.tramo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrConductor6Binding
import com.inovation.tramo.databinding.ActivityIrConductor7Binding

class IrConductorActivity7 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor7)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}