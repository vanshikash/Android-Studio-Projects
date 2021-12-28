package com.example.rollthedice

import org.junit.Assert.assertTrue
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        assertTrue("The value off diceRoll is not in valid range", diceRoll in 1..6)


    }
    }
