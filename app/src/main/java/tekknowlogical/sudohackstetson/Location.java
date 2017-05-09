package tekknowlogical.sudohackstetson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tim on 4/2/2017.
 */

public class Location {

    @SerializedName("address")
    public String address;

    @SerializedName("latitude")
    public String latitude;

    @SerializedName("longitude")
    public String longitude;
}
