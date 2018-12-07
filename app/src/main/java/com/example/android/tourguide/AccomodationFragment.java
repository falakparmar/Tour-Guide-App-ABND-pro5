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

public class AccomodationFragment extends Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_accomodation, container, false);
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getText(R.string.a3).toString(),getText(R.string.location).toString(),R.drawable.hotelhaus));
        places.add(new Places(getText(R.string.a4).toString(),getText(R.string.location).toString(),R.drawable.romantichotel));
        places.add(new Places(getText(R.string.a6).toString(),getText(R.string.location).toString(),R.drawable.hotelglockenhof));

        ListView listView = (ListView) rootView.findViewById(R.id.stay);
        PlacesAdapter placesAdapter = new PlacesAdapter(rootView.getContext(),places);
        listView.setAdapter(placesAdapter);

        return rootView;
    }
}
