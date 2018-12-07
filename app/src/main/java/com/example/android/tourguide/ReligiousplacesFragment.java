package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import com.example.android.tourguide.R;
import com.example.android.tourguide.Places;
import com.example.android.tourguide.PlacesAdapter;


import java.util.ArrayList;
public class ReligiousplacesFragment extends Fragment {


    public ReligiousplacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_religiousplaces, container, false);

        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getText(R.string.rp1).toString(),getText(R.string.location).toString(),R.drawable.buddhapadipa_temple));
        places.add(new Places(getText(R.string.rp4).toString(),getText(R.string.location).toString(),R.drawable.market_church_of_our_dear_lady));
        places.add(new Places(getText(R.string.rp5).toString(),getText(R.string.location).toString(),R.drawable.islamic_centre_hamburg));


        ListView listView = (ListView) rootView.findViewById(R.id.religious);
        PlacesAdapter placesAdapter = new PlacesAdapter(rootView.getContext(),places);
        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
