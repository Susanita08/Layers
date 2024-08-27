package com.curso.android.linearlayout

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Toast.makeText(this,
            "Oncreate() is Called",
            Toast.LENGTH_SHORT).show()

        val googleBtn = findViewById<android.widget.Button>(R.id.button_google);
        val secondPageBtn = findViewById<android.widget.Button>(R.id.button_next);

        googleBtn.setOnClickListener {
            openBrowser()
        }

        secondPageBtn.setOnClickListener {
            goToSecondActivity()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun goToSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun openBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://www.google.com"))
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,
            "OnStart() is Called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this,
            "OnResume() is Called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this,
            "OnPause() is Called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this,
            "OnStop() is Called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,
            "OnDestroy() is Called",
            Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this,
            "OnRestart() is Called",
            Toast.LENGTH_SHORT).show()
    }
}