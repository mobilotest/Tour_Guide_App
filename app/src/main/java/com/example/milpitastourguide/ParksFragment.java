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

        // create an array of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Sinnott Park", "Tahoe Dr, Milpitas, CA 95035", R.drawable.sinnott_park, "6509337070", "www.goo.gle"));
        items.add(new Item("Foothill Park", "398 Roswell Dr, Milpitas, CA 95035", R.drawable.foothill_park, "6509337070", "www.goo.gle"));
        items.add(new Item("Park Metro East", "330 E Curtis Ave, Milpitas, CA 95035", R.drawable.park_metro_east, "6509337070", "www.goo.gle"));
        items.add(new Item("Hidden Lake Park", "Milpitas, CA 95035", R.drawable.hidden_lake_park, "6509337070", "www.goo.gle"));
        items.add(new Item("Hall Memorial Park", "304 La Honda Dr, Milpitas, CA 95035", R.drawable.hall_memo_park, "6509337070", "www.goo.gle"));
        items.add(new Item("Ed R Levin Park", "3100 Calaveras Rd, Milpitas, CA 95035", R.drawable.ed_r_levin_park, "6509337070", "www.goo.gle"));
        items.add(new Item("Murphy Park", "Milpitas, CA 95035", R.drawable.murthy_park, "6509337070", "www.goo.gle"));
        items.add(new Item("Alviso Adobe Park", "2100 Calaveras Rd, Milpitas, CA 95035", R.drawable.alviso_adobe_park, "6509337070", "www.goo.gle"));

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