package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

        val dice2 = Dice(6)
        val dice2Roll = dice2.roll()
        //To view the random output after rolling the dice
//        val finalTextView: TextView = findViewById(R.id.textView)
//        finalTextView.text = dice1Roll.toString()
//
//        val finalTextView3: TextView = findViewById(R.id.textView3)
//        finalTextView3.text = dice2Roll.toString()

        //find imageview in layout
        val dice1Image : ImageView = findViewById(R.id.imageView2)
        val dice2Image : ImageView = findViewById(R.id.imageView3)
        //display imageview corresponding to rolled number
        when(dice1Roll)
        {
            1 -> dice1Image.setImageResource(R.drawable.dice_1)
            2 -> dice1Image.setImageResource(R.drawable.dice_2)
            3 -> dice1Image.setImageResource(R.drawable.dice_3)
            4 -> dice1Image.setImageResource(R.drawable.dice_4)
            5 -> dice1Image.setImageResource(R.drawable.dice_5)
            6 -> dice1Image.setImageResource(R.drawable.dice_6)
        }

        when(dice2Roll)
        {
            1 -> dice2Image.setImageResource(R.drawable.dice_1)
            2 -> dice2Image.setImageResource(R.drawable.dice_2)
            3 -> dice2Image.setImageResource(R.drawable.dice_3)
            4 -> dice2Image.setImageResource(R.drawable.dice_4)
            5 -> dice2Image.setImageResource(R.drawable.dice_5)
            6 -> dice2Image.setImageResource(R.drawable.dice_6)
        }



        //update content description
        dice1Image.contentDescription = dice1Roll.toString()
        dice2Image.contentDescription = dice2Roll.toString()



    }
}

//Dice roll logic
class Dice(private val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }
}