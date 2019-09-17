package com.example.kotlinapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  val SECOND_ACTIVITY : Int = 1
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

            // this is when you are not expecting any result from the activity you are calling
            //startActivity(intent)

            // this is used when you are expecting a result from the activity you are calling
            //then, you also have to overrinde onActivityResult method
            startActivityForResult(intent, SECOND_ACTIVITY)
        }

        /*incrementButton.setOnLongClickListener{
            Toast.makeText(this,"Long click",Toast.LENGTH_LONG).show()
            true // returns a boolean because it need to tells to android runtime that it has finished of handling all the events,
            //this because it will manage click listener having this completed
        }
        */

        implicitIntentButton.setOnClickListener {
            val implicitIntent = Intent()

            implicitIntent.action = Intent.ACTION_VIEW
            implicitIntent.data = Uri.parse("https://www.google.com")
            startActivity(implicitIntent)
        }

    }

    /*
    fun addNumbre(v : View)
    {
        val currVal = helloText.text.toString().toInt()
        val nextVal = currVal + 1
        helloText.text = nextVal.toString()
    }
    */

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == SECOND_ACTIVITY && resultCode == Activity.RESULT_OK)
        {
            val resultMessage = data?.getStringExtra("Result")
            Log.d("Activity result","$resultMessage")
            Toast.makeText(this,"SECOND ACTIVITY WAS STOPPED CORRECTLY AND IT JUST SENT THE MESSAGE: $resultMessage",Toast.LENGTH_SHORT)
        }
    }

}
