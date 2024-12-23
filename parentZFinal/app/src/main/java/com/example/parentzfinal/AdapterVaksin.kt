package com.example.parentzfinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterVaksin (
    private val context: Context,
    private val namaVaksin: Array<String>,
    private val deskripsiVaksin: Array<String>
) : RecyclerView.Adapter<AdapterVaksin.VaksinViewHolder>() {

    // ViewHolder untuk menampung referensi item layout
    inner class VaksinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNamaVaksin: TextView = itemView.findViewById(R.id.tvNamaVaksin)
        val tvDeskVaksin: TextView = itemView.findViewById(R.id.tvDeskVaksin)
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VaksinViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layoutvaksin, parent, false)
        return VaksinViewHolder(view)
    }

    override fun onBindViewHolder(holder: VaksinViewHolder, position: Int) {
        holder.tvNamaVaksin.text = namaVaksin[position]
        holder.tvDeskVaksin.text = deskripsiVaksin[position]

        // Logika jika ada tindakan untuk CheckBox
        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Aksi jika dicentang
                println("Vaksin ${namaVaksin[position]} dipilih.")
            } else {
                // Aksi jika tidak dicentang
                println("Vaksin ${namaVaksin[position]} batal dipilih.")
            }
        }
    }

    override fun getItemCount(): Int = namaVaksin.size
}