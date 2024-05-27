package com.example.visca_tugas_minggu_8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.content.Intent

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
    fun favorit (view: View) {
        Intent(this, T_Favorite::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun toflashsale (view: View) {
        Intent(this, Tampilan_Flashsale::class.java).also {
            startActivity(it)
            finish()
        }
    }
    fun barang (view: View) {
        Intent(this, T_Barang::class.java).also {
            startActivity(it)
            finish()
        }
    }
}