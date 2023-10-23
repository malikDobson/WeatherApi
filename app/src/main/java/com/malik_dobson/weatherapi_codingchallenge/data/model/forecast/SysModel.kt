package com.malik_dobson.weatherapi_codingchallenge.data.model.forecast


import com.google.gson.annotations.SerializedName

data class SysModel(
    @SerializedName("pod")
    val pod: String? = ""
)