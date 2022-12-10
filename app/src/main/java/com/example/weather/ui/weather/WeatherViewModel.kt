package com.example.weather.ui.weather

import androidx.lifecycle.*
import com.example.weather.logic.Repository
import com.example.weather.logic.model.qky_Location

class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<qky_Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) { location ->
        Repository.refreshWeather(location.lng, location.lat, placeName)
    }

    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = qky_Location(lng, lat)
    }

}