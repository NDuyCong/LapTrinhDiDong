package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button=findViewById(R.id.nut)
        rollButton.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            //toast.show()
            // cách 2 Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
           // val resultTextView: TextView =findViewById(R.id.textView)
            //resultTextView.text ="6"
            rollDice()
        }
        rollDice()//Hiển thị xúc xắc ngẫu nhiên khi ta chưa nhấn Roll
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll= dice.roll()
        /*Bài 4 bước 4
        val resultTextView: TextView=findViewById(R.id.textView)
        resultTextView.text=diceRoll.toString()
         */
        //Bài 5 bước 5
        val diceImage: ImageView=findViewById(R.id.imageView)
        //tối ưu code
        val drawableResource = when (diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
        /*
        when(diceRoll){
            1->diceImage.setImageResource(R.drawable.dice_1)
            2->diceImage.setImageResource(R.drawable.dice_2)
            3->diceImage.setImageResource(R.drawable.dice_3)
            4->diceImage.setImageResource(R.drawable.dice_4)
            5->diceImage.setImageResource(R.drawable.dice_5)
            6->diceImage.setImageResource(R.drawable.dice_6)
        }
         */
    }

    class Dice(val numSides: Int){
        fun roll():Int{
            return(1..numSides).random()
        }
    }
}