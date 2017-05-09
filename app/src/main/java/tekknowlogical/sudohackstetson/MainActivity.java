package tekknowlogical.sudohackstetson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.foursquare.android.nativeoauth.FoursquareOAuth;
import com.foursquare.android.nativeoauth.model.AccessTokenResponse;
import com.foursquare.android.nativeoauth.model.AuthCodeResponse;
import com.wenchao.cardstack.CardStack;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity
    implements RestaurantCallback {

    private CardsAdapter cardsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardStack cardStack = (CardStack)findViewById(R.id.container);
        cardStack.setContentResource(R.layout.card_layout);
        cardStack.setStackMargin(20);

        ApiCallHandler apiCallHandler = new ApiCallHandler(this);
        apiCallHandler.start();

        cardsAdapter = new CardsAdapter(getApplicationContext(),0);

        cardStack.setAdapter(cardsAdapter);

    }

    @Override
    public void onDataParsed(ArrayList<Restaurants> restaurants) {

        cardsAdapter.addAll(restaurants);

    }
}
