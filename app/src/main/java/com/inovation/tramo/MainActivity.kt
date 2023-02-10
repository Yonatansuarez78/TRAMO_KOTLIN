package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()

        binding.ComoCliente.setOnClickListener{
            goIrCliente()
        }
        binding.ComoConductor.setOnClickListener{
            goIrConductor()
        }
    }

    private fun goIrConductor() {
        val intent = Intent(this, IrConductorActivity::class.java)
        startActivity(intent)
    }

    private fun goIrCliente(){
        val intent = Intent(this, IrClienteActivity::class.java)
        startActivity(intent)
    }
}