package eu.tutorials.theshoppinnglist

import com.google.android.gms.location.Geofence.GeofenceTransition
import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {
    @GET
    suspend fun getAddressFromCoordinate(
        @Query("latlng")latlang: String,
        @Query("key")apiKey: String
    ):GeocodingResponse
}