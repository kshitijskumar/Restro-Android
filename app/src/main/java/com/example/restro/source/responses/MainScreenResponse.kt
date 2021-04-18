package com.example.restro.source.responses

data class MainScreenResponse(
        val title: String? = null,
        val listOfRestaurants : List<RestaurantDetails> = listOf()
)