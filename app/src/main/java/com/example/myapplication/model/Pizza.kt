package com.example.myapplication.model

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatRadioButton
import com.example.myapplication.R
import java.io.Serializable
import java.util.UUID

data class Pizza(
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var description: String,
    var imagePizza: Int,
    var price: Int,
    var pizzaOrNot: Boolean
):Serializable

//class MainActivity : AppCompatActivity() {
//
//    private lateinit var zbLeft: AppCompatRadioButton
//    private lateinit var zbRight: AppCompatRadioButton
//    private lateinit var zbCenter: AppCompatRadioButton
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        zbLeft = findViewById(R.id.rbLeft)
//        zbRight = findViewById(R.id.rbRight)
//        zbCenter = findViewById(R.id.rbCenter)
//    }
//
//    fun onRadioButtonClicked(view: View) {
//        val isSelected = (view as AppCompatRadioButton).isChecked
//
//        when (view.id) {
//            R.id.zbLeft -> {
//                if (isSelected) {
//                    rbLeft.setTextColor(Color.WHITE)
//                    rbRight.setTextColor(Color.RED)
//                    rbCenter.setTextColor(Color.RED)
//                }
//            }
//            R.id.zbCenter -> {
//                if (isSelected) {
//                    rbLeft.setTextColor(Color.RED)
//                    rbRight.setTextColor(Color.WHITE)
//                    rbCenter.setTextColor(Color.RED)
//                }
//            }
//            R.id.zbRight -> {
//                if (isSelected) {
//                    rbCenter.setTextColor(Color.RED)
//                    rbRight.setTextColor(Color.WHITE)
//                    rbLeft.setTextColor(Color.RED)
//                }
//            }
//        }
//    }
//}

