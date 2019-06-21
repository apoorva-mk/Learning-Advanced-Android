package org.apoorva.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.roll_button_text)
        diceImage = findViewById(R.id.dice_image)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Rolling Dice", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val diceImage = findViewById<ImageView>(R.id.dice_image)

        val randomInt = Random().nextInt(6)+1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        diceImage.setImageResource(drawableResource)
    }
}
