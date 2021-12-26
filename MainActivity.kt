package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }





    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        //TASK #4
//        val redButton = findViewById<Button>(R.id.red_button)
//        val greenButton = findViewById<Button>(R.id.green_button)
//        val yellowButton = findViewById<Button>(R.id.yellow_button)

//        val clickableViews: List<View> =
//            listOf(
//                boxOneText, boxTwoText, boxThreeText,
//                boxFourText, boxFiveText, rootConstraintLayout,
//                redButton, greenButton, yellowButton
//            )

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText, boxNineText, boxTenText, boxElevenText, boxTwelveText, rootConstraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }


    }


    private fun makeColored(view: View) {

//        R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_six_text -> view.setBackgroundColor(Color.RED)
            R.id.box_seven_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_eight_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_nine_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_ten_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.BLACK)
            R.id.box_twelve_text -> view.setBackgroundColor(Color.BLACK)


            // Boxes using custom colors for background
//            R.id.red_button -> tree.setBackgroundResource(R.color.my_red)
//            R.id.yellow_button -> four.setBackgroundResource(R.color.my_yellow)
//            R.id.green_button -> five.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)


            // FOR IMAGES
//              R.id.box_one_text -> view.setBackgroundResource(R.drawable.dice_1)
//              R.id.box_two_text -> view.setBackgroundResource(R.drawable.dice_1)
//              R.id.box_three_text -> view.setBackgroundResource(R.drawable.dice_1)
//              R.id.box_four_text -> view.setBackgroundResource(R.drawable.dice_1)
//              R.id.box_five_text -> view.setBackgroundResource(R.drawable.dice_1)

//
//            else -> view.setBackgroundResource(R.drawable.empty_dice)
        }
    }

    //TASK #4

//    private fun makeColored(view: View) {
//        val three = findViewById<TextView>(R.id.box_three_text)
//        val four = findViewById<TextView>(R.id.box_four_text)
//        val five = findViewById<TextView>(R.id.box_five_text)
//
//        when (view.id) {
//
//            // Boxes using Color class colors for background
//            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
//
//            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
//            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
//            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
//
//
//
////            // Boxes using custom colors for background
////            R.id.red_button -> three.setBackgroundResource(R.color.my_red)
////            R.id.yellow_button -> four.setBackgroundResource(R.color.my_yellow)
////            R.id.green_button -> five.setBackgroundResource(R.color.my_green)
//
//            else -> view.setBackgroundColor(Color.LTGRAY)
//        }
//    }


}