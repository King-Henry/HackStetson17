package tekknowlogical.sudohackstetson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Tim on 4/2/2017.
 */

public class SearchResult {
    /*"results_found": 4,
            "results_start": 0,
            "results_shown": 4,*/
    @SerializedName("results_found")
    public int resultsFound;

    @SerializedName("results_start")
    public int resultsStart;

    @SerializedName("results_shown")
    public int resultsShown;

    @SerializedName("restaurants")
    public ArrayList<Restaurants> restaurants;
}
