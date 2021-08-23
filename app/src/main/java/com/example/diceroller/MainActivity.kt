package com.example.diceroller

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        dice = findViewById(R.id.dice)

        dice.setImageResource(R.drawable.dice_6)
        dice.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        Toast.makeText(this, "dice rolled", Toast.LENGTH_SHORT).show()
        val drawableResource = when (Random().nextInt(6) + 1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice.setImageResource(drawableResource)

    }
}