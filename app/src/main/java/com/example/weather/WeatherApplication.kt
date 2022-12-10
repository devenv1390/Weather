package com.example.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.os.Bundle

class WeatherApplication : Application() {
    companion object {
        const val TOKEN = "6SXb6k7u8HBv2lDM"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}