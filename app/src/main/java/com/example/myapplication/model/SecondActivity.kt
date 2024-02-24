package com.example.myapplication.model

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.Adapter.pizzaAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBinding
import com.example.myapplication.model.Pizza

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result:Pizza = intent.extras?.getSerializable("pizza") as Pizza
        with(binding){
            secondActivityImg.setImageResource(result.imagePizza)
            titleTextView.text = result.name
            descriptionTextView.text = result.description
            priceButton.text = "Add to cart ${result.price} KZT"
        }

    }

    fun goBack(view: View) {
        finish()
    }

}