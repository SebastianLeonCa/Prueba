package com.example.prueba.ui.Futbolistas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.R

class ListadoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View =  inflater.inflate(R.layout.fragment_listado, container, false)

        val rvPlayer: RecyclerView = view.findViewById(R.id.rvPlayer)
        rvPlayer.layoutManager = LinearLayoutManager(requireContext())
        rvPlayer.adapter = PlayerAdapter(getPlayers())

        return view
    }

    private fun getPlayers(): List<PlayerModel>{
        val lstPlayer: ArrayList<PlayerModel> = ArrayList()

        lstPlayer.add(
            PlayerModel(1, "Messi", "1993", "27", R.drawable.imagen1))
        lstPlayer.add(
            PlayerModel(2, "Cristiano", "2000", "31", R.drawable.imagen1))
        lstPlayer.add(
            PlayerModel(3, "Mbappe", "1997", "18", R.drawable.imagen1))
        return lstPlayer
    }
}