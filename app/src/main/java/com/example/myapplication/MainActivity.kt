package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.example.myapplication.Adapter.pizzaAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.Pizza
import com.example.myapplication.model.PizzaDataSource.pizzaList
import com.example.myapplication.model.SecondActivity
import java.util.Locale


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var searchView: SearchView
    private lateinit var adapter: pizzaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        searchView = binding.search
        adapter = pizzaAdapter(
            onPizzaClick = {
                handlPizzaClick(it)
            }
        )


        binding.recycleView.adapter = adapter
        adapter.setData(pizzaList)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true


            }
        })
    }

    private fun handlPizzaClick(pizza: Pizza){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("pizza", pizza)
        startActivity(intent)
    }

    private fun filterList(query: String?) {
        if (query != null) {
            val filteredList = pizzaList.filter { it.name.lowercase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)) }
            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setData(filteredList)
            }
        }
        else {
            adapter.setData(pizzaList)
        }
    }

}
