package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrConductor7Binding
import com.inovation.tramo.databinding.ActivityIrConductor8Binding

class IrConductorActivity8 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor8)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.RegistroConductor9.setOnClickListener{
            goIrConductor9()
        }
    }

    private fun goIrConductor9() {
        val intent = Intent(this, IrConductorActivity9::class.java)
        startActivity(intent)
    }
}