package com.example.restro.source.repositories

import com.example.restro.utils.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import java.lang.Exception

abstract class BaseRepository {

    suspend fun <T>safeApi(call : suspend () -> Response<T>) : Result<T> {

        return withContext(Dispatchers.IO) {
            try {
                val response = call.invoke()
                if (response.isSuccessful && response.body() != null) {
                    Result.Success(response.body()!!)
                }else {
                    val errorMsg = when(response.code()) {
                        404 -> "Services not found"
                        else -> "Something went wrong on our side."
                    }

                    Result.Error(errorMsg)
                }
            }catch (e: Exception) {
                val errorMsg = e.localizedMessage ?: "Something went wrong!"
                Result.Error(errorMsg)
            }
        }

    }
}