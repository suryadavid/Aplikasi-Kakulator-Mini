package com.example.kakulatordavid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    private lateinit var input1 : EditText
    private lateinit var input2 : EditText
    private lateinit var hitung : Button
    private lateinit var hitung2 : Button
    private lateinit var hitung3 : Button
    private lateinit var hitung4 : Button
    private lateinit var hitung5 : Button
    private lateinit var hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input1 = findViewById(R.id.et1)
        input2 = findViewById(R.id.et2)
        hitung = findViewById(R.id.btn_tambah)
        hitung2 = findViewById(R.id.btn_kurangi)
        hitung3 = findViewById(R.id.btn_bagi)
        hitung4 = findViewById(R.id.btn_kali)
        hitung5 = findViewById(R.id.btn_sisahasilbagi)
        hasil = findViewById(R.id.hasil)

        hitung.setOnClickListener {
            hitungTambah()
        }

        hitung2.setOnClickListener {
            hitung2Kurangi()
        }

        hitung3.setOnClickListener {
            hitung3Bagi()
        }

        hitung4.setOnClickListener {
            hitung4Kali()
        }

        hitung5.setOnClickListener {
            hitung5SisaHasilbagi()
        }
    }
    private fun hitungTambah() {
        val floatInput1 = input1.text.toString().toFloat()
        val floatInput2 = input2.text.toString().toFloat()
        val hasilHitung = floatInput1 + floatInput2
        tampilkan(hasilHitung)
    }

    private fun hitung2Kurangi() {
        val floatInput1 = input1.text.toString().toFloat()
        val floatInput2 = input2.text.toString().toFloat()
        val hasilHitung = floatInput1 - floatInput2
        tampilkan(hasilHitung)
    }

    private fun hitung3Bagi() {
        val floatInput1 = input1.text.toString().toFloat()
        val floatInput2 = input2.text.toString().toFloat()
        val hasilHitung = floatInput1 / floatInput2
        tampilkan(hasilHitung)
    }

    private fun hitung4Kali() {
        val floatInput1 = input1.text.toString().toFloat()
        val floatInput2 = input2.text.toString().toFloat()
        val hasilHitung = floatInput1 * floatInput2
        tampilkan(hasilHitung)
    }

    private fun hitung5SisaHasilbagi() {
        val floatInput1 = input1.text.toString().toFloat()
        val floatInput2 = input2.text.toString().toFloat()
        val hasilHitung = floatInput1 % floatInput2
        tampilkan(hasilHitung)
    }

    private fun tampilkan(hasilHitung: Float) {
        val strHasil : String
        strHasil = "$hasilHitung"
        hasil.text = strHasil
    }
}