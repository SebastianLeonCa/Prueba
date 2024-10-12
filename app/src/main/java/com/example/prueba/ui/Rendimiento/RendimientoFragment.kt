package com.example.prueba.ui.Rendimiento

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.prueba.R

class RendimientoFragment : Fragment() {
override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_rendimiento, container, false)

        val etKilometros: EditText = view.findViewById(R.id.etKilometros)
        val etMinutos: EditText = view.findViewById(R.id.etMinutos)
        val btnCalcular: Button = view.findViewById(R.id.btnCalcular)
        val tvRespuesta: TextView = view.findViewById(R.id.tvRespuesta)

        btnCalcular.setOnClickListener {
            val kmText = etKilometros.text.toString()
            val minText = etMinutos.text.toString()
            val km = kmText.toInt()
            val min = minText.toInt()

            val respuesta = km / min
            tvRespuesta.text = respuesta.toString()
        }

        return view
    }
}