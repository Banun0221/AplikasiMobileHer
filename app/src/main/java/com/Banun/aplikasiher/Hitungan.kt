package com.Banun.aplikasiher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Hitungan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitungan)
        supportActionBar?.title = "Halaman Hitung"

        edtNilai = findViewById(R.id.edt_uang)
        btnCalculate = findViewById(R.id.btn_konversi)
        tvResult1 = findViewById(R.id.tv_result1)
        tvResult2 = findViewById(R.id.tv_result2)

        btnCalculate.setOnClickListener(this)
    }
    private lateinit var edtNilai: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult1: TextView
    private lateinit var tvResult2: TextView

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_konversi) {
            val inputNilai = edtNilai.text.toString().trim()

            var isEmptyFields = false
            if (inputNilai.isEmpty()) {
                isEmptyFields = true
                edtNilai.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                val konversi1 = inputNilai.toInt()/15000
                val konversi2 = inputNilai.toInt()/3500

                tvResult1.text = ("Hasil Konversi "+konversi1.toString()+" Dollar")
                tvResult2.text = ("Hasil Konversi "+konversi2.toString()+" Ringgit")

            }

        }
    }
}