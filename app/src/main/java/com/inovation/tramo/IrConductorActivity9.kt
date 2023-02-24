package com.inovation.tramo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.inovation.tramo.databinding.ActivityIrConductor8Binding
import com.inovation.tramo.databinding.ActivityIrConductor9Binding
import kotlin.reflect.typeOf

class IrConductorActivity9 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor9Binding
    private val PICK_FILE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor9)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.RegistroConductor10.setOnClickListener{
            goIrConductor10()
        }

        binding.imageViewSelected.setOnClickListener {
            selectFile()
        }

    }

    private fun goIrConductor10() {
        val intent = Intent(this, IrConductorActivity10::class.java)
        startActivity(intent)
    }

    private fun selectFile() {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "image/*"
            putExtra(Intent.EXTRA_MIME_TYPES, arrayOf("image/jpg", "image/png", "image/jpg"))
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
  }


