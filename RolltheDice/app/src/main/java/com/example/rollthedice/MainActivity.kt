package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

        private fun rollDice() {
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val finalTextView: TextView = findViewById(R.id.textView)
            finalTextView.text = diceRoll.toString()
        }
}

class Dice(private val sides: Int){

    fun roll() : Int{
        return (1..sides).random()
    }
}