package com.example.pasto;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ListView;
import android.widget.Toast;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Toast.makeText(getActivity().getApplicationContext(), "Click GPS icon to get your location!", Toast.LENGTH_LONG).show();

        String[] res = {"Sam's Cafe", "Mr. Burger", "Indie Fresh", "California Bird"};
        int cover[] = {R.drawable.samscafe, R.drawable.mrburger, R.drawable.indiefresh, R.drawable.californiabird};
        ListView simpleList;
        Gallery simpleGallery;
        CustomGalleryAdapter customGalleryAdapter;
        int add[] = {R.drawable.ad1, R.drawable.ad2, R.drawable.ad3, R.drawable.ad4};

        simpleList = (ListView) view.findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplicationContext(), res, cover);
        simpleList.setAdapter(customAdapter);

        simpleGallery = (Gallery) view.findViewById(R.id.simpleGallery); // get the reference of Gallery
        customGalleryAdapter = new CustomGalleryAdapter(getActivity().getApplicationContext(), add); // initialize the adapter
        simpleGallery.setAdapter(customGalleryAdapter); // set the adapter
        simpleGallery.setSpacing(20);
        simpleGallery.setAnimationDuration(1000);

        return view;
    }
}
