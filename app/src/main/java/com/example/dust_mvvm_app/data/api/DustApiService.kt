import com.example.dust_mvvm_app.BuildConfig.DUST_SERVICE_KEY
import com.example.dust_mvvm_app.data.model.stationinformation.StationResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DustApiService {
    @GET(
        "http://apis.data.go.kr/B552584/MsrstnInfoInqireSvc/getNearbyMsrstnList" +
                "?serviceKey=${DUST_SERVICE_KEY}" +
                "&returnType=json"
    )
    suspend fun getDustInformation(
        @Query("tmX") tmX: Double,
        @Query("tmY") tmY: Double
    ): Response<StationResponse>
}