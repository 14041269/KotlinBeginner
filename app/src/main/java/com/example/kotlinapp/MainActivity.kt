package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //helloText.text = "1"

        /*incrementButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })*/


        //Event listeners with lambda expression
        incrementButton.setOnClickListener{
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            intent.putExtra("Nombre","Juan")
            startActivity(intent)
        }

        /*incrementButton.setOnLongClickListener{
            Toast.makeText(this,"Long click",Toast.LENGTH_LONG).show()
            true // returns a boolean because it need to tells to android runtime that it has finished of handling all the events,
            //this because it will manage click listener having this completed
        }
        */


    }

    /*
    fun addNumbre(v : View)
    {
        val currVal = helloText.text.toString().toInt()
        val nextVal = currVal + 1
        helloText.text = nextVal.toString()
    }
    */


}
