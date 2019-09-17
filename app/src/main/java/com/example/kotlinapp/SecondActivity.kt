package com.example.kotlinapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val mainIntent: String = intent.getStringExtra("Nombre")
        intentText.text = intentText.text.toString() + mainIntent

        returnButton.setOnClickListener {
            val returnIntent = Intent()
            returnIntent.putExtra("Result","Resultado Existoso")
            setResult(Activity.RESULT_OK,returnIntent)
            finish()
        }

    }


}
