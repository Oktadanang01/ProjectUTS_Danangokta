package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var Button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button = findViewById(R.id.login)
        Button.setOnClickListener(this)

    }


override fun onClick(v: View) {
    when(v.id){ //menghubungkan button ketika diklik akan otomatis masuk ke halaman kedua
        R.id.login ->{
            val login = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(login)

        }
    }
}
}