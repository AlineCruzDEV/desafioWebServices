package com.digitalhouse.marvelhqs.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.marvelhqs.R
import com.digitalhouse.marvelhqs.entities.HQ
import com.digitalhouse.marvelhqs.ui.DetalheHQActivity
import com.digitalhouse.marvelhqs.ui.RegisterActivity
import com.squareup.picasso.Picasso

class HQAdapter(val listaHQS: ArrayList<HQ>, val context: Context) :
        RecyclerView.Adapter<HQAdapter.HQViewHolder>() {


    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): HQViewHolder {
        val itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.item_home_quadrinho, parent, false)
        return HQViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HQViewHolder, position: Int) {
        val currentItem = listaHQS[position]
        holder.tvNumHQ.text = currentItem.issueNumber.toString()
        Picasso.get().load(currentItem.thumbnail.toString())
            .into(holder.ivHQ)

        holder.ivHQ.setOnClickListener {
            context.startActivity(
                Intent(context, DetalheHQActivity::class.java)
                    .putExtra("hq", currentItem)
            )
        }

    }

    override fun getItemCount(): Int {
        return listaHQS.size
    }

    class HQViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNumHQ: TextView = itemView.findViewById(R.id.tvItemHomeQuadrinho)
        var ivHQ : ImageView = itemView.findViewById(R.id.ivItemHomeQuadrinho)

    }

}