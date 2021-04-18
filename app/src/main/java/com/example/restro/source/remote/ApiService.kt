package com.example.restro.source.remote

import com.example.restro.source.models.UserChoice
import com.example.restro.source.responses.RestaurantDetails
import com.example.restro.utils.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body

interface ApiService {

    //get mapping here
    suspend fun getRecommendedRestaurants(@Body userChoice: UserChoice) : Response<List<RestaurantDetails>>
    //this will contain a body of user preferences

    companion object {
        private val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        private val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        private val retrofit = Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        fun getApiService() = retrofit.create(ApiService::class.java)
    }
}