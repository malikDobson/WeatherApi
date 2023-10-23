package com.malik_dobson.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class CloudsModel(
    @SerializedName("all")
    val all: Int? = 0
)