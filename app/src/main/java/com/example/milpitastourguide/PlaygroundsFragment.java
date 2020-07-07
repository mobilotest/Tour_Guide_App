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

        // Create an array of words TODO:buttons with links to Phone, Web and Email intents
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.playgrounds_cardozapark), getString(R.string.playgrounds_cardozapark_address), R.drawable.play_cardoza_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.playgrounds_ceranopark), getString(R.string.playgrounds_ceranopark_address), R.drawable.play_cerano_park, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.playgrounds_dixonlandpark), getString(R.string.playgrounds_dixonlandpark_address), R.drawable.play_dixon_land, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.parks_hallmemorialpark), getString(R.string.parks_hallmemorialpark_address), R.drawable.play_hall_mem, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.playgrounds_pinewookpark), getString(R.string.playgrounds_pinewookpark_address), R.drawable.play_pinewood, "6509337070", "www.goo.gle"));

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
