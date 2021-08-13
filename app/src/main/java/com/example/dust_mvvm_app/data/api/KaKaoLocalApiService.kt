package com.example.dust_mvvm_app.data.api

import com.example.dust_mvvm_app.BuildConfig
import com.example.dust_mvvm_app.data.model.tmcoordinates.TmCoordinatesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface KaKaoLocalApiService {
    @Headers("Authorization: KakaoAK ${BuildConfig.KAKAO_SERVICE_KEY}")
    @GET("/v2/local/geo/transcoord.json?output_coord=TM")
    suspend fun getTmCoordinates(
        @Query("x") longitude: Double,
        @Query("y") latitude: Double
    ): Response<TmCoordinatesResponse>

}