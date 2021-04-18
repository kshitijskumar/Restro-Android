package com.example.restro.source.responses


data class RestaurantDetails(
    val id: Long = 0L,
    val name: String? = null,
    val priceForTwo: Int = 1000,
    val locality: String? = null,
    val address: String? = null,
    val cuisine: List<String> = listOf(),
    val photos: List<String> = listOf(),
    val miscFeatures: List<String> = listOf(),
    val contactDetails: String? = null,
    val timing: String? = null,
    val rating: Int = 0,
    val menu: List<String> = listOf(),
    val reviews: List<String> = listOf()
)
