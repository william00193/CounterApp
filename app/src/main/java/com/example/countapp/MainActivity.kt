package com.example.countapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        //Naming and finding by button to increment counter
        val btn1 = findViewById<Button>(R.id.btn1)

        //Naming and finding by textview to view count
        val tv1 = findViewById<TextView>(R.id.tv1)

        //Naming and finding by textview to view count
        val reset = findViewById<TextView>(R.id.btn2)



        //OnClick listener for Increment Button
        btn1.setOnClickListener(){

            //Defining count and setting it to tv1
            val count = tv1.text as String

            //Defining count as plus and setting it as an integer
            val plus = count.toInt() +1

            //Displaying plus in tv1
            tv1.text = plus.toString()
        }

        //OnClick listener for Increment Button
        reset.setOnClickListener(){

          tv1.text = "0"
        }


    }



//    fun onClick(view: android.view.View) {
//
//
//        //Incrementing count variable by 1 each time button is clicked
//        count++
//
//        //Naming Displayed text and finding the text view 'tv1'
//        val displayText : TextView = findViewById(R.id.tv1)
//
//        //Displaying count variable into text view
//        displayText.setText(count)
//
//    }

}

//Count for Number of button clicks

