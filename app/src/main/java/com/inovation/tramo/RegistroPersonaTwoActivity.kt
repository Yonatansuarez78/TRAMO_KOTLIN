package com.inovation.tramo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inovation.tramo.databinding.ActivityRegistroPersonaTwoBinding

class RegistroPersonaTwoActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityRegistroPersonaTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroPersonaTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()

        setSupportActionBar(binding.toolbarRegistroPersonaTwo)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.TextTerminosCondiciones.setOnClickListener{
            irTerminosCodiciones()
        }

    }

    private fun irTerminosCodiciones(){
        val intent = Intent(this, TerminosCondicionesActivity::class.java)
        startActivity(intent)
    }
}