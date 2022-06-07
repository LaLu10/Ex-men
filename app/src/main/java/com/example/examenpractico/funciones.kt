package com.example.examenpractico

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

fun getSpinner(myContext: MainActivity, mySpinner: Spinner, opSelect:Array<String>, data: Int){

    val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(myContext, data,
        android.R.layout.simple_spinner_item)
    mySpinner.adapter = adaptador
    mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            opSelect[0] = parent?.getItemAtPosition(position).toString()
        }
        override fun onNothingSelected(parent: AdapterView<*>?) {
            opSelect[0] = "No ha habido selección"
        }
    }
}
