package com.inovation.tramo

import android.R
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.bumptech.glide.Glide
import com.inovation.tramo.databinding.ActivityRegistroPersonaBinding
import java.io.InputStream

class RegistroPersonaActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityRegistroPersonaBinding
    private val PICK_FILE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroPersonaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.supportActionBar?.hide()

        setSupportActionBar(binding.toolbarRegistroPersona)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //llama a la función selectFile al hacer click en algún botón o elemento de tu UI
        binding.imageViewSelected.setOnClickListener {
            selectFile()
        }

        val spinner: Spinner = binding.spinner
        val items = listOf("C.C", "C.E", "Otro")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        binding.SeguirRegistroPersona.setOnClickListener {
            seguirRegistro()
        }

    }

    private fun selectFile() {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "image/*"
            putExtra(Intent.EXTRA_MIME_TYPES, arrayOf("image/jpeg", "image/png", "image/jpg"))
        }
        startActivityForResult(intent, PICK_FILE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_FILE_REQUEST && resultCode == Activity.RESULT_OK) {
            data?.data?.let { uri ->
                Glide.with(this)
                    .load(uri)
                    .into(binding.imageViewSelected)
            }
        }
    }

    private fun seguirRegistro(){
        val intent = Intent(this, RegistroPersonaTwoActivity::class.java)
        startActivity(intent)
    }
}