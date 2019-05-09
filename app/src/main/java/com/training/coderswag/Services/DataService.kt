package com.training.coderswag.Services

import com.training.coderswag.Model.Category
import com.training.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$10", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$12", "hat4"),
            Product("Devslopes Graphic Beanie", "$10", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$12", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$30", "hoodie1"),
            Product("Devslopes Hoodie Red", "$35", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$40", "hoodie3"),
            Product("Devslopes Black Hoodie", "$25", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$30", "hoodie1"),
            Product("Devslopes Hoodie Red", "$35", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$40", "hoodie3"),
            Product("Devslopes Black Hoodie", "$25", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$27", "shirt1"),
            Product("Devslopes Badge Light Gray", "$15", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$32", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$20", "shirt5"),
            Product("Devslopes Shirt Black", "$27", "shirt1"),
            Product("Devslopes Badge Light Gray", "$15", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$32", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$20", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }

    }

}