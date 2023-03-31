package com.normi.tugasnormiah

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahDataActivity2 : AppCompatActivity() {
    companion object {
        const val EXTRA_TEXT = "extra_text"
    }

    private lateinit var tvPenerima : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data2)

        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang di kirim : $tvReceived"

        tvPenerima.text = text
    }
}