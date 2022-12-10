package com.example.weather.logic.model

data class Weather(val realtime: qky_RealtimeResponse.Realtime, val daily: DailyResponse.Daily)