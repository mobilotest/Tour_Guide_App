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

        // Create a list of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Red Lobster", "503 E Calaveras Blvd, Milpitas, CA 95035", R.drawable.red_lobster, "6509337070", "www.goo.gle"));
        items.add(new Item("Naan and Masala", "94 Dempsey Rd, Milpitas, CA 95035", R.drawable.naan_n_masala, "6509337070", "www.goo.gle"));
        items.add(new Item("Mikonos Grill", "756 E Calaveras Blvd, Milpitas, CA 95035", R.drawable.mikonos_grill, "6509337070", "www.goo.gle"));
        items.add(new Item("Yogurtland", "752 E Calaveras Blvd, Milpitas, CA 95035", R.drawable.yogurtland, "6509337070", "www.goo.gle"));
        items.add(new Item("Black Bear Diner", "174 W Calaveras Blvd, Milpitas, CA 95035", R.drawable.black_bear, "6509337070", "www.goo.gle"));

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