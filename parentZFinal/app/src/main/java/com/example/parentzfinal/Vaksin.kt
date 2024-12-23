package com.example.parentzfinal

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Vaksin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vaksin)

        val buttonBack = findViewById<ImageButton>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish() // Kembali ke halaman sebelumnya (Beranda.kt)
        }

        val scrollView = findViewById<NestedScrollView>(R.id.main) // ID NestedScrollView jika ada
        val btnLahir = findViewById<Button>(R.id.btnLahir)
        val tvLahir = findViewById<TextView>(R.id.tvLahir)
        btnLahir.setOnClickListener {
            // Mendapatkan posisi relatif elemen tvLahir terhadap layar
            val location = IntArray(2)
            tvLahir.getLocationOnScreen(location)

            // Menghitung posisi relatif elemen tvLahir terhadap NestedScrollView
            val scrollViewLocation = IntArray(2)
            scrollView.getLocationOnScreen(scrollViewLocation)

            // Menghitung jarak yang perlu digulirkan
            val yCoordinate = location[1] - scrollViewLocation[1]

            // Scroll ke posisi tersebut dalam NestedScrollView
            scrollView.post {
                scrollView.smoothScrollTo(0, yCoordinate)
            }
        }

        val btn2bulan = findViewById<Button>(R.id.btn2bulan)
        val tv2bulan = findViewById<TextView>(R.id.tv2bulan)
        btn2bulan.setOnClickListener {
            // Mendapatkan posisi relatif elemen tv2bulan terhadap layar
            val location = IntArray(2)
            tv2bulan.getLocationOnScreen(location)

            // Menghitung posisi relatif elemen tv2bulan terhadap NestedScrollView
            val scrollViewLocation = IntArray(2)
            scrollView.getLocationOnScreen(scrollViewLocation)

            // Menghitung jarak yang perlu digulirkan
            val yCoordinate = location[1] - scrollViewLocation[1]

            // Scroll ke posisi tersebut dalam NestedScrollView
            scrollView.post {
                scrollView.smoothScrollTo(0, yCoordinate)
            }
        }

        val btn4bulan = findViewById<Button>(R.id.btn4bulan)
        val tv4bulan = findViewById<TextView>(R.id.tv4bulan)
        btn4bulan.setOnClickListener {
            // Mendapatkan posisi relatif elemen tv2bulan terhadap layar
            val location = IntArray(2)
            tv4bulan.getLocationOnScreen(location)

            // Menghitung posisi relatif elemen tv2bulan terhadap NestedScrollView
            val scrollViewLocation = IntArray(2)
            scrollView.getLocationOnScreen(scrollViewLocation)

            // Menghitung jarak yang perlu digulirkan
            val yCoordinate = location[1] - scrollViewLocation[1]

            // Scroll ke posisi tersebut dalam NestedScrollView
            scrollView.post {
                scrollView.smoothScrollTo(0, yCoordinate)
            }
        }

        val btn1tahun = findViewById<Button>(R.id.btn1tahun)
        val tv1tahun = findViewById<TextView>(R.id.tv1tahun)
        btn1tahun.setOnClickListener {
            // Mendapatkan posisi relatif elemen tv2bulan terhadap layar
            val location = IntArray(2)
            tv1tahun.getLocationOnScreen(location)

            // Menghitung posisi relatif elemen tv2bulan terhadap NestedScrollView
            val scrollViewLocation = IntArray(2)
            scrollView.getLocationOnScreen(scrollViewLocation)

            // Menghitung jarak yang perlu digulirkan
            val yCoordinate = location[1] - scrollViewLocation[1]

            // Scroll ke posisi tersebut dalam NestedScrollView
            scrollView.post {
                scrollView.smoothScrollTo(0, yCoordinate)
            }
        }

        val btn2tahun = findViewById<Button>(R.id.btn2tahun)
        val tv2tahun = findViewById<TextView>(R.id.tv2tahun)
        btn2tahun.setOnClickListener {
            // Mendapatkan posisi relatif elemen tv2bulan terhadap layar
            val location = IntArray(2)
            tv2tahun.getLocationOnScreen(location)

            // Menghitung posisi relatif elemen tv2bulan terhadap NestedScrollView
            val scrollViewLocation = IntArray(2)
            scrollView.getLocationOnScreen(scrollViewLocation)

            // Menghitung jarak yang perlu digulirkan
            val yCoordinate = location[1] - scrollViewLocation[1]

            // Scroll ke posisi tersebut dalam NestedScrollView
            scrollView.post {
                scrollView.smoothScrollTo(0, yCoordinate)
            }
        }

        val btn3tahun = findViewById<Button>(R.id.btn3tahun)
        val tv3tahun = findViewById<TextView>(R.id.tv3tahun)
        btn3tahun.setOnClickListener {
            // Mendapatkan posisi relatif elemen tv2bulan terhadap layar
            val location = IntArray(2)
            tv3tahun.getLocationOnScreen(location)

            // Menghitung posisi relatif elemen tv2bulan terhadap NestedScrollView
            val scrollViewLocation = IntArray(2)
            scrollView.getLocationOnScreen(scrollViewLocation)

            // Menghitung jarak yang perlu digulirkan
            val yCoordinate = location[1] - scrollViewLocation[1]

            // Scroll ke posisi tersebut dalam NestedScrollView
            scrollView.post {
                scrollView.smoothScrollTo(0, yCoordinate)
            }
        }

        val rvVaksin1: RecyclerView = findViewById(R.id.rvVaksin1)
        val rvVaksin2: RecyclerView = findViewById(R.id.rvVaksin2)
        val rvVaksin3: RecyclerView = findViewById(R.id.rvVaksin3)
        val rvVaksin4: RecyclerView = findViewById(R.id.rvVaksin4)
        val rvVaksin5: RecyclerView = findViewById(R.id.rvVaksin5)
        val rvVaksin6: RecyclerView = findViewById(R.id.rvVaksin6)

        // Ambil data dari strings.xml
        val namaVaksin = resources.getStringArray(R.array.nama_vaksin)
        val deskripsiVaksin = resources.getStringArray(R.array.deskripsi_vaksin)

        // Atur Adapter dan LayoutManager
        rvVaksin1.layoutManager = LinearLayoutManager(this)
        rvVaksin1.adapter = AdapterVaksin(this, namaVaksin, deskripsiVaksin)
        rvVaksin2.layoutManager = LinearLayoutManager(this)
        rvVaksin2.adapter = AdapterVaksin(this, namaVaksin, deskripsiVaksin)
        rvVaksin3.layoutManager = LinearLayoutManager(this)
        rvVaksin3.adapter = AdapterVaksin(this, namaVaksin, deskripsiVaksin)
        rvVaksin4.layoutManager = LinearLayoutManager(this)
        rvVaksin4.adapter = AdapterVaksin(this, namaVaksin, deskripsiVaksin)
        rvVaksin5.layoutManager = LinearLayoutManager(this)
        rvVaksin5.adapter = AdapterVaksin(this, namaVaksin, deskripsiVaksin)
        rvVaksin6.layoutManager = LinearLayoutManager(this)
        rvVaksin6.adapter = AdapterVaksin(this, namaVaksin, deskripsiVaksin)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}