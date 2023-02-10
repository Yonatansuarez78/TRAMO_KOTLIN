package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityPersonaBinding

class PersonaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPersonaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarPersona)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.RegistrarsePersona.setOnClickListener {
            RegistrarsePersona()
        }
    }

    private fun RegistrarsePersona(){
        val intent = Intent(this, RegistroPersonaActivity::class.java)
        startActivity(intent)
    }
}