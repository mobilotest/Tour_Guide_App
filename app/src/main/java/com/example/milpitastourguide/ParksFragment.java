package com.example.milpitastourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // create an array of words TODO:buttons with links to Phone, Web and Email intents
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.parks_SinnottPark), getString(R.string.parks_SinnottPark_address), R.drawable.sinnott_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parks_FoothillPark), getString(R.string.parks_FoothillPark_address), R.drawable.foothill_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parks_ParkMetroEast), getString(R.string.parks_ParkMetroEast_address), R.drawable.park_metro_east, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parks_HiddenLakePark), getString(R.string.parks_HiddenLakePark_address), R.drawable.hidden_lake_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parks_HallMemorialPark), getString(R.string.parks_HallMemorialPark_address), R.drawable.hall_memo_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parksEdevinPark), getString(R.string.parks_EdevinPark_address), R.drawable.ed_r_levin_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parksMurphyPark), getString(R.string.parks_MurphyPark_address), R.drawable.murthy_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parksAlvisoAdobePark), getString(R.string.parks_AlvisoAdobePark_address), R.drawable.alviso_adobe_park, "6509337070", "www.goo.gle"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_parks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}