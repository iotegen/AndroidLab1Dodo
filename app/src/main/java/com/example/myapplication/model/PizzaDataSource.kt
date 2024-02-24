package com.example.myapplication.model

import com.example.myapplication.R

object PizzaDataSource {
    val pizzaList = arrayListOf<Pizza>(
        Pizza(
            name = "Pepperoni with mushrooms",
            description = "Chicken pepperoni, mozzarella cheese, mushrooms, alfredo sauce",
            imagePizza = R.drawable.pepmush,
            price = 2000,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Ham&Pickles",
            description = "Ranch sauce, chicken ham, mozzarella cheese, pickles, red onion",
            imagePizza = R.drawable.hampickles,
            price = 2000,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Julienne",
            description = "Chicken, mushrooms, rich mushroom sauce, red onion, garlic, mushrooms, cheddar and parmesan cheeses, alfredo sauce",
            imagePizza = R.drawable.julienne,
            price = 2700,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Cheesy",
            description = "Mozzarella cheese, cheddar and parmesan cheeses, alfredo sauce",
            imagePizza = R.drawable.cheesy1,
            price = 1900,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Pepperoni Fresh",
            description = "Chicken pepperoni, mozzarella cheese, tomatoes, marinara sauce",
            imagePizza = R.drawable.peppfresh,
            price = 1900,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Double Chicken",
            description = "Chicken, mozzarella cheese, alfredo sauce",
            imagePizza = R.drawable.doublechicken,
            price = 2100,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Meal",
            description = "Treat yourself! Small pizza, Dodster, a drink and a sauce. Pizza in a combo can be changed ",
            imagePizza = R.drawable.meal,
            price = 3900,
            pizzaOrNot = false
        ),
        Pizza(
            name = "Ham & Cheese",
            description = "Chicken ham, mozzarella cheese, alfredo sauce",
            imagePizza = R.drawable.hamcheese,
            price = 2000,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Carbonara",
            description = "Chicken ham, cheddar and parmesan cheeses, mozzarella cheese, tomatoes, red onion, garlic, alfredo sauce, italian seasoning",
            imagePizza = R.drawable.carbonara,
            price = 2400,
            pizzaOrNot = true
        ),
        Pizza(
            name = "Dodo",
            description = "Chicken ham, beef meatballs, chicken pepperoni, mozzarella cheese, tomatoes, mushrooms, sweet pepper, red onion, garlic, marinara sauce",
            imagePizza = R.drawable.dodo,
            price = 2900,
            pizzaOrNot = true
        ),

        )
}