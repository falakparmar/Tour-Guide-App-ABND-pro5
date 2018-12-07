package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;


import com.example.android.tourguide.R;
import com.example.android.tourguide.PlacesAdapter;
import com.example.android.tourguide.Places;
public class TouristsFragment extends Fragment {
 ;

    public TouristsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tourists, container, false);
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getText(R.string.tf3).toString(),getText(R.string.location).toString(),R.drawable.brandenburg_gate));
        places.add(new Places(getText(R.string.tf5).toString(),getText(R.string.location).toString(),R.drawable.hofbraeuhaus_am_platzl));
        places.add(new Places(getText(R.string.tf6).toString(),getText(R.string.location).toString(),R.drawable.town_hall_munich));

        ListView listView = (ListView) rootView.findViewById(R.id.tourist);
        PlacesAdapter placesAdapter = new PlacesAdapter(rootView.getContext(),places);
        listView.setAdapter(placesAdapter);

        return rootView;
    }


}
