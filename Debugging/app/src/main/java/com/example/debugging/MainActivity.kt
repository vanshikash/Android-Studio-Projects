package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloTextView: TextView = findViewById(R.id.hello_world)
        helloTextView.text = "Hello, debugging"
        logging()
        division()
    }
    fun division()
    {
        val num = 60
        var den = 4
        repeat(4){
            Log.v(TAG, "${num/den}")
            den--
        }
    }
        fun logging(){
            Log.v(TAG, "Hello World!")

        }

}


