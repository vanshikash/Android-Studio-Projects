package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        //Do Dice roll when button is clicked
        rollButton.setOnClickListener { rollDice() }
    }

        private fun rollDice() {
            //setting number of sides of dice to 6
            val dice = Dice(6)
            val diceRoll = dice.roll()
            //find imageview in layout
            val diceImage : ImageView = findViewById(R.id.imageView)
            //display imageview corresponding to rolled number
            when(diceRoll)
            {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }

            //update content description
            diceImage.contentDescription = diceRoll.toString()


        }
}

class Dice(private val sides: Int){

    fun roll() : Int{
        return (1..sides).random()
    }
}