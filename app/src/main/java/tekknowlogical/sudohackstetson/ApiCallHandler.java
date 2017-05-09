package tekknowlogical.sudohackstetson;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tim on 4/1/2017.
 */

public class ApiCallHandler implements Callback<SearchResult>{

    static final String BASE_URL = "https://developers.zomato.com/api/v2.1/";
    RestaurantCallback restaurantCallback;

    public ApiCallHandler(RestaurantCallback callback) {

        restaurantCallback = callback;
    }

    public void start() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GPlacesService service = retrofit.create(GPlacesService.class);
        Call<SearchResult> call = service.listBreakfastRestaurants(Double.toString(37.786882)
                , Double.toString(-122.399972));
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {

        if(response.isSuccessful()){

            restaurantCallback.onDataParsed(response.body().restaurants);
        }
        else{
            
            Log.d("response:", " " + response.toString());
            Log.d("Response status", "response FAILED");
        }
    }

    @Override
    public void onFailure(Call<SearchResult> call, Throwable t) {

        t.printStackTrace();
        Log.d("onFailure", "FAILED");


    }
}
