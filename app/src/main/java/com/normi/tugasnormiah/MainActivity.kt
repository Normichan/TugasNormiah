package com.normi.tugasnormiah

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)

    }
    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_intent ->{ kotlin.run {
                val intentBiasa = Intent (this@MainActivity,PindahActivity2::class.java)
                startActivity(intentBiasa)
            }
            }
            R.id.btn_pindah_data -> kotlin.run {
                val intentData = Intent(this@MainActivity,PindahDataActivity2::class.java)
                intentData.putExtra(PindahDataActivity2.EXTRA_TEXT,"Halo,ayo belajar Kotlin")
                startActivity(intentData)
            }
            R.id.btn_pindah_data -> kotlin.run {
                val intentData =  Intent( this@MainActivity, PindahDataActivity2::class.java)
                intentData.putExtra(PindahDataActivity2.EXTRA_TEXT, "Halo, ayo belajar kotlin")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek-> kotlin.run {
                val cars = Cars(
                    "Toyota Yaris",
                    2020,
                    "BM 2020 SAR"
                )
                val intentObjek = Intent(this@MainActivity, PindahObjekActivity2::class.java)
                intentObjek.putExtra(PindahObjekActivity2.EXTRA_CARS,cars)
                startActivity(intentObjek)
            }
        }
    }
}