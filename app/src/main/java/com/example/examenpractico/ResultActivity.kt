package com.example.examenpractico

import android.os.Binder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.examenpractico.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val datos = intent.extras
        val str = """   DATOS GENERALES
            Nombre: ${datos?.get("NOMBRE")}
            Edad: ${datos?.get("EDAD")}
            Categoría Familiar: ${datos?.get("CATEGORIA")}
            Idioma: ${datos?.get("IDIOMA")}
            Nivel:${datos?.get("NIVEL")}
        """.trimIndent()
        binding.tvDatos.text = str
        binding.imgTO.setImageResource(R.drawable.istockphoto_471015650_612x612)
        binding.btnVolver.setOnClickListener { onBackPressed() }
    }
}