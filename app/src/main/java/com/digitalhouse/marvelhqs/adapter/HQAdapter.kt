package com.digitalhouse.marvelhqs.adapter

//class HQAdapter(val listaRestaurantes: List<Restaurante>, val context: Context) :
//        RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {
//
//
//    override fun onCreateViewHolder(
//            parent: ViewGroup,
//            viewType: Int
//    ): RestauranteAdapter.RestauranteViewHolder {
//        val itemView =
//                LayoutInflater.from(parent.context).inflate(R.layout.restaurante_item, parent, false)
//        return RestauranteViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: RestauranteAdapter.RestauranteViewHolder, position: Int) {
//        val currentItem = listaRestaurantes[position]
//        holder.tvNomeRestaurante.setText(currentItem.nome)
//        holder.tvEnderecoRestaurante.setText(currentItem.endereco)
//        holder.ivRestaurante.setImageResource(currentItem.imgRestaurante)
//
//        holder.itemView.setOnClickListener {
//            Toast.makeText(context, "agora passar o Cardápio", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return listaRestaurantes.size
//    }
//
//
//    class RestauranteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val tvNomeRestaurante: TextView = itemView.findViewById(R.id.tvNomeRestaurante)
//        val tvEnderecoRestaurante: TextView = itemView.findViewById(R.id.tvEnderecoRestaurante)
//        val ivRestaurante: ImageView = itemView.findViewById(R.id.ivRestaurante)
//
//    }