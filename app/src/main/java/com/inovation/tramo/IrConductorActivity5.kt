package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrConductor4Binding
import com.inovation.tramo.databinding.ActivityIrConductor5Binding

class IrConductorActivity5 : AppCompatActivity() {
    private lateinit var binding:ActivityIrConductor5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityIrConductor5Binding.inflate(layoutInflater)
    setContentView(binding.root)

    setSupportActionBar(binding.toolbarIrConductor5)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.RegistroConductor6.setOnClickListener{
            goIrConductor6()
        }
    }

    private fun goIrConductor6() {
        val intent = Intent(this, IrConductorActivity6::class.java)
        startActivity(intent)
    }
}