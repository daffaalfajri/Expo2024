package com.example.parentzfinal

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Beranda : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beranda)

        //interaksi button pindah halaman
        val btnNutrisi = findViewById<ImageButton>(R.id.btnNutrisi)
        btnNutrisi.setOnClickListener {
            val intent = Intent(this, Nutrisi::class.java)
            startActivity(intent)
        }

        val btnKonsultasi = findViewById<ImageButton>(R.id.btnKonsul)
        btnKonsultasi.setOnClickListener {
            val intent = Intent(this, Konsultasi::class.java)
            startActivity(intent)
        }

        val btnVaksin = findViewById<ImageButton>(R.id.btnVaksin)
        btnVaksin.setOnClickListener {
            val intent = Intent(this, Vaksin::class.java)
            startActivity(intent)
        }

        val btnArtikel = findViewById<ImageButton>(R.id.btnArtikel)
        btnArtikel.setOnClickListener{
            val intent = Intent(this, ArtikelKomunitas::class.java)
            startActivity(intent)
        }




        //Recycler View keluhan
        val namaKeluhan = resources.getStringArray(R.array.nama_keluhan)
        val deskripsiKeluhan = resources.getStringArray(R.array.deskripsi_keluhan)

        // Gabungkan data menjadi List<Keluhan>
        val keluhanList = namaKeluhan.indices.map { index ->
            Regis.Keluhan(namaKeluhan[index], deskripsiKeluhan[index])
        }

        // Inisialisasi RecyclerView
        val recyclerViewKeluhan = findViewById<RecyclerView>(R.id.rvKonsulBeranda)
        recyclerViewKeluhan.layoutManager = LinearLayoutManag er(this)
        recyclerViewKeluhan.adapter = AdapterKonsultasi(keluhanList)



        // Ambil data dari strings.xml
        val namaMakanan = resources.getStringArray(R.array.nama_makanan)
        val deskripsiMakanan = resources.getStringArray(R.array.deskripsi_makanan)

        // Gabungkan data menjadi List<Makanan>
        val makananList = namaMakanan.indices.map { index ->
            Nutrisi.Makanan(namaMakanan[index], deskripsiMakanan[index])
        }

        // Inisialisasi RecyclerView
        val recyclerViewResep = findViewById<RecyclerView>(R.id.rvResep)
        recyclerViewResep.layoutManager = LinearLayoutManager(this)
        recyclerViewResep.adapter = AdapterResepNutrisi(makananList)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}