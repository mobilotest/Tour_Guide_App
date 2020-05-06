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
public class PlaygroundsFragment extends Fragment {

    public PlaygroundsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // create an array of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Cardoza Park", "weṭeṭṭi", R.drawable.play_cardoza_park));
        items.add(new Item("Cerano Park", "chokokki", R.drawable.play_cerano_park));
        items.add(new Item("Dixon Land Park", "ṭakaakki", R.drawable.play_dixon_land));
        items.add(new Item("Hall Memory Park", "ṭopoppi", R.drawable.play_hall_mem));
        items.add(new Item("Jose Higuera Park", "kululli", R.drawable.play_jose_higuera_park));
        items.add(new Item("Pinewook Park", "kelelli", R.drawable.play_pinewood));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_playgrounds);

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