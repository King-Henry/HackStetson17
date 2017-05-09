package tekknowlogical.sudohackstetson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Tim on 4/1/2017.
 */

public interface GPlacesService {

    @Headers("user-key:07bf12ce6e2fa7b63a275e8094897563")
    @GET("search?")
    Call<SearchResult> listBreakfastRestaurants(@Query("lat") String latitude, @Query("long") String longitude);

    @GET("search?latitude={lat}&longitude={long}")
    Call<List<Restaurants>> listRestaurants(@Path("lat") double latitude, @Path("long") double longitude);

    @GET("search?latitude={lat}&longitude={long}")
    Call<List<Restaurants>> listBars(@Path("lat") double latitude, @Path("long") double longitude);

}
