package com.digitalhouse.marvelhqs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.entities.HQ

class HQAdapter(val listaHQs: List<HQ>, val context: Context) :
        RecyclerView.Adapter<HQAdapter.HQViewHolder>() {


    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): HQAdapter.HQViewHolder {
        val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.item_home_quadrinho, parent, false)
        return HQViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HQAdapter.HQViewHolder, position: Int) {
        val currentItem = listaHQs[position]
        holder.tvNumHQ.text = currentItem.nome

        holder.itemView.setOnClickListener {
            Toast.makeText(context, "agora passar os detalhes do quadrinho", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listaHQs.size
    }


    class HQViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNumHQ: TextView = itemView.findViewById(R.id.tvItemHomeQuadrinho)
    }

}