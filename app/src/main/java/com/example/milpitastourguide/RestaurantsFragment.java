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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of words TODO:buttons with links to Phone, Web and Email intents
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.restaurant_redlobster), getString(R.string.restaurant_redlobster_address), R.drawable.red_lobster, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.restaurant_naanmasala), getString(R.string.restaurant_naanmasala_address), R.drawable.naan_n_masala, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.restaurant_mikonosgrill),  getString(R.string.restaurant_mikonosgrill_address), R.drawable.mikonos_grill, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.restaurant_yogurtland),  getString(R.string.restaurant_yogurtland_address), R.drawable.yogurtland, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.restaurant_blackbeardiner),  getString(R.string.restaurant_blackbeardiner_address), R.drawable.black_bear, "6509337070", "www.goo.gle"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // ItemAdapter.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}