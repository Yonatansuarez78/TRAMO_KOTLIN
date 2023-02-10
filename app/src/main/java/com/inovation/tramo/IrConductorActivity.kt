package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrClienteBinding
import com.inovation.tramo.databinding.ActivityIrConductorBinding

class IrConductorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.RegistrarseConductor2.setOnClickListener{
            goIrConductor2()
        }
    }

    private fun goIrConductor2() {
        val intent = Intent(this, IrConductorActivity2::class.java)
        startActivity(intent)
    }
}
