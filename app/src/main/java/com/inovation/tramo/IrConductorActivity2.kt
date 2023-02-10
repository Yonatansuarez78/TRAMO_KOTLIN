package com.inovation.tramo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.inovation.tramo.databinding.ActivityIrConductor2Binding
import com.inovation.tramo.databinding.ActivityIrConductorBinding

class IrConductorActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityIrConductor2Binding
    private val PICK_FILE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIrConductor2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarIrConductor2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.imageViewSelected.setOnClickListener {
            selectFile()
        }

        binding.RegistroConductor3.setOnClickListener{
            goIrConductor3()
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


    private fun goIrConductor3() {
        val intent = Intent(this, IrConductorActivity3::class.java)
        startActivity(intent)
    }
}

