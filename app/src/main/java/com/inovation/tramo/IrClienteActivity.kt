package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityIrClienteBinding

class IrClienteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIrClienteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrClienteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrCliente)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.IrComoPersona.setOnClickListener {
            ComoPersona()
        }
    }

    private fun ComoPersona(){
        val intent = Intent(this, PersonaActivity::class.java)
        startActivity(intent)
    }
}