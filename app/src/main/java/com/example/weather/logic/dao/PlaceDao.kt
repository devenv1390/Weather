package com.example.weather.logic.dao

import android.content.Context
import android.provider.Settings.System.putString
import androidx.core.content.edit
import com.example.weather.WeatherApplication
import com.example.weather.logic.model.qky_Place
import com.google.gson.Gson

object PlaceDao {

    fun savePlace(place: qky_Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): qky_Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, qky_Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        WeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

}