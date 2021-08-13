package com.example.dust_mvvm_app.data.model.stationinformation


import com.google.gson.annotations.SerializedName

data class Body(
    @SerializedName("items")
    val stations: List<Station>?,
    @SerializedName("numOfRows")
    val numOfRows: Int?,
    @SerializedName("pageNo")
    val pageNo: Int?,
    @SerializedName("totalCount")
    val totalCount: Int?
)