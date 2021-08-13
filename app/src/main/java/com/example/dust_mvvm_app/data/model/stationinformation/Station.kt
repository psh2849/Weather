package com.example.dust_mvvm_app.data.model.stationinformation


import com.google.gson.annotations.SerializedName

data class Station(
    @SerializedName("addr")
    val addr: String?,
    @SerializedName("stationName")
    val stationName: String?,
    @SerializedName("tm")
    val tm: Double?
)