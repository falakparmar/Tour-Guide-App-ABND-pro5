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

public class ResturantsFragment extends Fragment {


    public ResturantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_resturants, container, false);
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getText(R.string.r1).toString(),getText(R.string.location).toString(),R.drawable.trattoria_la_grappa));
        places.add(new Places(getText(R.string.r5).toString(),getText(R.string.location).toString(),R.drawable.zucker__zimt_cafe_restaurant));
        places.add(new Places(getText(R.string.r6).toString(),getText(R.string.location).toString(),R.drawable.vassilios_lois_griechisches_testaurant_delphi));

        ListView listView = (ListView) rootView.findViewById(R.id.rest);
        PlacesAdapter placesAdapter = new PlacesAdapter(rootView.getContext(),places);
        listView.setAdapter(placesAdapter);

        return rootView;
    }


}
