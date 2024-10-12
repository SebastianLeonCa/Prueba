package com.example.prueba.ui.Equipos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.prueba.R

class EquiposFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_equipos, container, false)

        val lvEquipos: ListView = view.findViewById(R.id.lvEquipos)
        val equipos = arrayOf("Manchester United", "Barcelona FC", "Loverpool", "Real Madrid")

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, equipos)

        lvEquipos.adapter = adapter

        return view
    }
}