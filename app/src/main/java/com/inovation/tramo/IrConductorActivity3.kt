package com.inovation.tramo

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.inovation.tramo.databinding.ActivityIrConductor2Binding
import com.inovation.tramo.databinding.ActivityIrConductor3Binding

class IrConductorActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor3)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.RegistroConductor4.setOnClickListener{
            goIrConductor4()
        }

        val spinner: Spinner = binding.spinner
        val items = listOf("C.C", "C.E", "Otro")
        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    private fun goIrConductor4() {
        val intent = Intent(this, IrConductorActivity4::class.java)
        startActivity(intent)
    }
}