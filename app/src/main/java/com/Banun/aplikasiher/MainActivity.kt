package com.Banun.aplikasiher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Halaman Utama"

        val btnprofile: Button = findViewById(R.id.btn_profil)
        btnprofile.setOnClickListener(this)

        val btnhitungan: Button = findViewById(R.id.btn_hitungan)
        btnhitungan.setOnClickListener(this)

        val btncal: Button = findViewById(R.id.btn_calculato)
        btncal.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_profil -> {
                val profileIntent = Intent(this@MainActivity, Profile::class.java)
                startActivity(profileIntent)
            }
            R.id.btn_hitungan -> {
                val hitungIntent = Intent(this@MainActivity, Hitungan::class.java)
                startActivity(hitungIntent)
            }
            R.id.btn_calculato -> {
                val calIntent = Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_CALCULATOR)
                startActivity(calIntent)
            }
        }
    }
}