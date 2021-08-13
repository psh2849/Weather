package com.example.dust_mvvm_app.di

import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val WeatherModule = module {
    single { Dispatchers.IO }
}