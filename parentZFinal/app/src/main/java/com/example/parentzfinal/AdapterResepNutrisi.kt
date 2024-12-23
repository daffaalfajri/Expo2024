package com.example.parentzfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterResepNutrisi(private val data: List<Nutrisi.Makanan>
    ) : RecyclerView.Adapter<AdapterResepNutrisi.ResepNutrisiViewHolder>() {

        inner class ResepNutrisiViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvTitleResep: TextView = view.findViewById(R.id.tvNamaMakanan)
            val tvDescriptionResep: TextView = view.findViewById(R.id.tvDeskMakan)
        }

        override fun getItemCount(): Int {
            return if (data.size > 3) 3 else data.size
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResepNutrisiViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.layoutresep, parent, false)
            return ResepNutrisiViewHolder(view)
        }

        override fun onBindViewHolder(holder: ResepNutrisiViewHolder, position: Int) {
            val item = data[position]
            holder.tvTitleResep.text = item.nama
            holder.tvDescriptionResep.text = item.deskripsi
        }




}