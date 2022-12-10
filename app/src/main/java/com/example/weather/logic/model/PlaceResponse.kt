package com.example.weather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<qky_Place>)
data class qky_Place(val name: String, val location: qky_Location,
                 @SerializedName("formatted_address") val address: String)
data class qky_Location(val lng: String, val lat: String)