package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrConductor3Binding
import com.inovation.tramo.databinding.ActivityIrConductor4Binding

class IrConductorActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor4)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        binding.RegistroConductor5.setOnClickListener{
            goIrConductor5()
        }
    }

    private fun goIrConductor5() {
        val intent = Intent(this, IrConductorActivity5::class.java)
        startActivity(intent)
    }
}