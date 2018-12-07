import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

    public class PlacesAdapter extends ArrayAdapter<Places> {
        private Context mContext;

        public PlacesAdapter(Context context, ArrayList<Places> placesArrayList) {
            super(context, 0, placesArrayList);
            mContext = context;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Places places = getItem(position);
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitems, parent, false);
            }
            ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
            TextView titleTextView = (TextView) convertView.findViewById(R.id.text_view);
            TextView locTextView = (TextView) convertView.findViewById(R.id.text);

            imageView.setImageResource(places.getImageResourceId());
            titleTextView.setText(places.getText());
            locTextView.setText(places.getLocation());

            return convertView;
        }
    }