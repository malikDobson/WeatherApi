package com.malik_dobson.weatherapi_codingchallenge.data.remote

import com.malik_dobson.weatherapi_codingchallenge.data.model.forecast.ForecastModel
import com.malik_dobson.weatherapi_codingchallenge.data.model.geocoding.GeocodingItemModel
import com.malik_dobson.weatherapi_codingchallenge.data.model.weather.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRequest {

    @GET(ApiDetails.WEATHER)
    suspend fun getWeather(
        @Query("lat") latitude: Double?,
        @Query("lon") longitude: Double?,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): WeatherModel

    @GET(ApiDetails.GEOCODING)
    suspend fun getCoordinates(
        @Query("q") query: String,
        @Query("limit") limit: Int,
        @Query("appid") apiKey: String
    ): List<GeocodingItemModel>

    @GET(ApiDetails.FORECAST)
    suspend fun getForecast(
        @Query("lat") latitude: Double?,
        @Query("lon") longitude: Double?,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): ForecastModel
}