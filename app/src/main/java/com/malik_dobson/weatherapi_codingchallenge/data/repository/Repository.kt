package com.malik_dobson.weatherapi_codingchallenge.data.repository

import com.malik_dobson.weatherapi_codingchallenge.data.model.forecast.ForecastModel
import com.malik_dobson.weatherapi_codingchallenge.data.model.geocoding.GeocodingItemModel
import com.malik_dobson.weatherapi_codingchallenge.data.model.weather.WeatherModel

interface Repository{
    suspend fun getWeather(latitude: Double?, longitude: Double?, units: String, apiKey: String): WeatherModel
    suspend fun getCoordinates(query: String, limit: Int, apiKey: String): List<GeocodingItemModel>
    suspend fun getForecast(latitude: Double?, longitude: Double?, units: String, apiKey: String): ForecastModel
}