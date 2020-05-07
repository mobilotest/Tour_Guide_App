package com.example.milpitastourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class BikingFragment extends Fragment{

    public BikingFragment() {
        // Required empty public constructor
    }

    View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // create an array of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Sierra Road Loop", "Milpitas, CA", R.drawable.sierra_road_loop, "6509337070", "www.goo.gle"));
        items.add(new Item("8 Miles", "Milpitas, CA", R.drawable.eight_road_cycling, "6509337070", "www.goo.gle"));
        items.add(new Item("38 Miles", "Milpitas, CA", R.drawable.thirthyeight_road_cycling, "6509337070", "www.goo.gle"));
        items.add(new Item("Calaveras Loop", "Milpitas, CA", R.drawable.calaveras_loop, "6509337070", "www.goo.gle"));
        items.add(new Item("51 Miles", "Milpitas, CA", R.drawable.fiftyone_road_cycling, "6509337070", "www.goo.gle"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_biking);

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