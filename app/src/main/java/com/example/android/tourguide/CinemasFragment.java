package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

import com.example.android.tourguide.R;
import com.example.android.tourguide.PlacesAdapter;
import com.example.android.tourguide.Places;


public class CinemasFragment extends Fragment {


    public CinemasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_cinemas, container, false);
        // Create a list of words
         ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getText(R.string.c2).toString(),getText(R.string.location).toString(),R.drawable.cinma_le_trfle));
         places.add(new Places(getText(R.string.c5).toString(),getText(R.string.location).toString(),R.drawable.dueutch_theater));



        ListView listView = (ListView) rootView.findViewById(R.id.cine);
        PlacesAdapter placesAdapter = new PlacesAdapter(rootView.getContext(),places);
        listView.setAdapter(placesAdapter);

        return rootView;
    }

}