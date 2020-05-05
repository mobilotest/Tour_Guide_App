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
public class WalkingFragment extends Fragment {

    public WalkingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // create an array of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Coyote Creek Trail", "weṭeṭṭi", R.drawable.coyote));
        items.add(new Item("Spring Valley Trail", "chokokki", R.drawable.spring_valley));
        items.add(new Item("Hetch Hetchy Trail", "ṭakaakki", R.drawable.hetch_hetchy));
        items.add(new Item("Agua Caliente Trail", "ṭopoppi", R.drawable.agua_caliente));

        // Create an {@link item_list}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        item_list adapter = new item_list(getActivity(), items, R.color.category_walking);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link item_list} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}