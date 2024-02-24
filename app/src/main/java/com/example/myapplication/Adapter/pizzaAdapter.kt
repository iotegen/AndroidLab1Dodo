package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemPizzaBinding
import com.example.myapplication.databinding.ItemNewPizzaBinding
import com.example.myapplication.model.Pizza
import kotlinx.coroutines.NonDisposableHandle
import kotlinx.coroutines.NonDisposableHandle.parent

class pizzaAdapter (
    private val onPizzaClick : (Pizza) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val pizzaList: ArrayList<Pizza> = ArrayList()

    /**
     * метод для обновления списка элементов
     */

    fun setData(pizza: List<Pizza>){
        pizzaList.clear()
        pizzaList.addAll(pizza)
        notifyDataSetChanged()
    }
    /**
    *  метод который будет создавать view для каждого объекта
    */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_PIZZA) ViewHolder(
            ItemPizzaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
        else {
            ViewHolder2(
                ItemNewPizzaBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }

    /**
    *  метод, для определения количества элементов списка
    */

    override fun getItemCount() = pizzaList.size
    /**
     * для вызова метода из ViewHolder'a
     */

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pizza = pizzaList[position]
        when(holder) {
            is ViewHolder -> holder.bind(pizza)
            is ViewHolder2 -> holder.bind(pizza)
        }
    }
    override fun getItemViewType(position: Int): Int {
        // Return the view type based on the position or any other criteria
        return if (pizzaList[position].pizzaOrNot) VIEW_TYPE_PIZZA else VIEW_TYPE_NEW_PIZZA
    }

    inner class ViewHolder(
        private val binding: ItemPizzaBinding
    ) : RecyclerView.ViewHolder(binding.root){

        fun bind(pizza: Pizza){
            with(binding){
                pizzaImg.setImageResource(pizza.imagePizza)
                titleTextView.text = pizza.name
                discriptionTextView.text = pizza.description
                pizzaPriceView.text= "from ${pizza.price} KZT"

                root.setOnClickListener {
                    onPizzaClick(pizza)
                }
            }
        }
    }
    inner class ViewHolder2(
        private val binding: ItemNewPizzaBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(pizza: Pizza){
            with(binding){
                pizzaImg.setImageResource(pizza.imagePizza)
                titleTextView.text = pizza.name
                discriptionTextView.text = pizza.description
                pizzaPriceView.text= "from ${pizza.price} KZT"

                root.setOnClickListener {
                    onPizzaClick(pizza)
                }
            }
        }
    }
    companion object {
        private const val VIEW_TYPE_PIZZA = 1
        private const val VIEW_TYPE_NEW_PIZZA = 2
    }

}
