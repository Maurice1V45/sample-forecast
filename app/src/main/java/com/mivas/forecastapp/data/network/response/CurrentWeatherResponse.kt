package com.mivas.forecastapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.mivas.forecastapp.data.db.entity.CurrentWeatherEntry
import com.mivas.forecastapp.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)