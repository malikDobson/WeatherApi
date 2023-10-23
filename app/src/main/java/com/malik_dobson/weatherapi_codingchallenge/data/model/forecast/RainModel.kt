package com.malik_dobson.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class RainModel(
    @SerializedName("3h")
    val h: Double? = 0.0
)