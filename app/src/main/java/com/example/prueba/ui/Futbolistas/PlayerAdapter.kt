package com.example.prueba.ui.Futbolistas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.R
import com.example.prueba.ui.Futbolistas.PlayerModel
import org.w3c.dom.Text

class PlayerAdapter(private var lstPlayer: List<PlayerModel>) :
    RecyclerView.Adapter<PlayerAdapter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val ivPlayer: ImageView = itemView.findViewById(R.id.ivPlayer)
        val tvYear: TextView = itemView.findViewById(R.id.tvYear)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvNum: TextView = itemView.findViewById(R.id.tvNum)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_player
            , parent, false))
    }

    override fun getItemCount(): Int {
        return lstPlayer.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemPlayer = lstPlayer[position]
        holder.ivPlayer.setImageResource(itemPlayer.imagen)
        holder.tvName.text = itemPlayer.nombreCompleto
        holder.tvNum.text = itemPlayer.edad
        holder.tvYear.text = itemPlayer.añoNacimiento
    }
}