package tekknowlogical.sudohackstetson;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;

/**
 * Created by Tim on 4/1/2017.
 */

public class CardsAdapter extends ArrayAdapter<Restaurants> {

    public CardsAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Log.d("URL: ",  getItem(position).restaurant.imageUrl);
        ImageView mainImage = (ImageView)convertView.findViewById(R.id.restaurant_image);
        TextView name = (TextView)convertView.findViewById(R.id.restaurant_name);
        name.setText(getItem(position).restaurant.name);
        Glide.with(getContext())
                .load(getItem(position).restaurant.imageUrl)
                .into(mainImage);
        return convertView;
    }

}
