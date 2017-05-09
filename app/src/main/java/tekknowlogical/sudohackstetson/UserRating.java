package tekknowlogical.sudohackstetson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tim on 4/2/2017.
 */

public class UserRating {

    @SerializedName("aggregate_rating")
    public double aggregateRating;

    @SerializedName("rating_text")
    public String veryGood;

    @SerializedName("rating_color")
    public String ratingColor;

    @SerializedName("votes")
    public int votes;
}
