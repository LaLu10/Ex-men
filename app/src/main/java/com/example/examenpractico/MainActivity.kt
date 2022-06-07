package com.example.examenpractico

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import com.example.examenpractico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var cat = arrayOf("")
    var familia = "Numerosa"
    var idioma = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSend.setOnClickListener { getAndSend()}
        binding.imageView6.setBackgroundResource(R.drawable._2215374_p_ginas_de__lbum_de_fotos_con_marcos_de_fotos_retro_vector_plantilla_de_dise_o2)
    }
    fun getAndSend() {
        val intentResult = Intent(this, ResultActivity::class.java)
        intentResult.putExtra("NOMBRE", binding.etName.text)
        intentResult.putExtra("NIVEL", cat)
        intentResult.putExtra("CATEGORIA", familia)
        intentResult.putExtra("IDIOMA", idioma.toString())
        intentResult.putExtra("EDAD", binding.etEdad.text)
        intentResult.putExtra("IMAGEN",binding.imageView6.toString())
        startActivity(intentResult)
    }

    fun CheckBoxClicked(view: View) {
        if (view is CheckBox) {
            val ckIdioma = view.text.toString()
            if (view.isChecked) {
                if (!idioma.contains(ckIdioma)) {
                    idioma.add(ckIdioma)
                }
            } else {
                if (idioma.contains(ckIdioma)) {
                    idioma.remove(ckIdioma)
                }
            }
        }
    }

    fun RadioClicked(view: View) {
        if (view is RadioButton)
            familia = view.text.toString()
    }
}