package com.androides.taskifyapp.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androides.taskifyapp.R

class FirstAppActivity : AppCompatActivity() {
    // Duración en milisegundos de la pantalla de presentación (en este caso, 3 segundos)
    private val SPLASH_TIME_OUT = 900L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        android.os.Handler().postDelayed({
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}