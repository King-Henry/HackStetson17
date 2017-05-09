package tekknowlogical.sudohackstetson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tim on 4/2/2017.
 */

public class Restaurant {

    @SerializedName("featured_image")
    public String imageUrl;

    @SerializedName("name")
    public String name;

    @SerializedName("location")
    public Location location;

    @SerializedName("user_rating")
    public UserRating userRating;

    @SerializedName("price_range")
    public String price;
}
