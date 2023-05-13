package com.n.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.n.quizapp.databinding.ActivityMainBinding
import kotlin.jvm.internal.Intrinsics.Kotlin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enName = findViewById<EditText>(R.id.enName)
        val btnStart = findViewById<Button>(R.id.btnStart)

        btnStart.setOnClickListener {
            if (enName.text.isEmpty()) {
                Toast.makeText(this, "Please, enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQustions::class.java)
                intent.putExtra(com.n.quizapp.Constants.USER_NAME,enName.toString())
                startActivity(intent)
//                finish()
            }
        }
    }
}
