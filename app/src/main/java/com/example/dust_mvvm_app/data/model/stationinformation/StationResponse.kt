package com.example.dust_mvvm_app.data.model.stationinformation


import com.google.gson.annotations.SerializedName

data class StationResponse(
    @SerializedName("response")
    val response: Response?
)