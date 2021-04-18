package com.example.restro.source.models

data class UserChoice(
    val ac: Boolean = true,
    val nonVeg: Boolean = true, //true means he wants both. false means pure veg
    val parking: Boolean = false, //true means strictly necessary, otherwise not necessary
    val seating: Boolean = false, //true means strictly necessary, otherwise not necessary
    val liquor: Int = 1, //1 means no problem, 2 means required, 3 strictly not available
    val hookah: Int = 1,
    val openSeating: Boolean = false, // true means strictly required otherwise no problem
    val djDance: Int = 1,
    val mainCourse: Boolean = false, //false means if even main course is present no problem, true means strictly needed
    val priceForTwo: Int = 700,
    val cuisine: List<String> = listOf(),
    val locality: String? = null, //default value to be decided
)
