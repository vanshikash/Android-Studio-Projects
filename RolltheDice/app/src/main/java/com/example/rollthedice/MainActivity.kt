package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// finds roll button and uses setOnClickListener
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

    //rollDice function
    private fun rollDice() {
        //creating dice object with six sides and rolling it
        val dice1 = Dice(6)
        val dice1Roll = dice1.roll()

        val dice2 = Dice(20)
        val dice2Roll = dice2.roll()
        //To view the random output after rolling the dice
        val finalTextView: TextView = findViewById(R.id.textView)
        finalTextView.text = dice1Roll.toString()

        val finalTextView3: TextView = findViewById(R.id.textView3)
        finalTextView3.text = dice2Roll.toString()




    }
}

//Dice roll logic
class Dice(private val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }
}