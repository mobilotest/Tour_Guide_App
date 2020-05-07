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
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // create an array of words TODO:buttons with links to Phone, Web and Email intents
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.walking_CoyoteCreekTrail), getString(R.string.walking_CoyoteCreekTrail_address), R.drawable.coyote, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.walking_SpringValleyTrail), getString(R.string.walking_SpringValleyTrail_address), R.drawable.spring_valley, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.walking_HetchHetchyTrail), getString(R.string.walking_HetchHetchyTrail_address), R.drawable.hetch_hetchy, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.walking_AguaCalienteTrail), getString(R.string.walking_AguaCalienteTrail_address), R.drawable.agua_caliente, "6509337070", "www.goo.gle"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_walking);

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