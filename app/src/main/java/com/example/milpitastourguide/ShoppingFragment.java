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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // create an array of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Great Mall", "447 Great Mall Dr, Milpitas, CA 95035", R.drawable.great_mall, "6509337070", "www.goo.gle"));
        items.add(new Item("Crescent Square", "1783 N Milpitas Blvd, Milpitas, CA 95035", R.drawable.crescent_sqare, "6509337070", "www.goo.gle"));
        items.add(new Item("Calaveras Plaza Shopping Center", "231 W Calaveras Blvd, Milpitas, CA 95035", R.drawable.calaveras_plaza, "6509337070", "www.goo.gle"));
        items.add(new Item("Milpitas Center", "20 S Abbott Ave, Milpitas, CA 95035", R.drawable.center, "6509337070", "www.goo.gle"));
        items.add(new Item("Milpitas Town Center", "555 E Calaveras Blvd, Milpitas, CA 95035", R.drawable.town_center, "6509337070", "www.goo.gle"));
        items.add(new Item("Milpitas Mall Shopping Center", "1535 Landess Ave, Milpitas, CA 95035", R.drawable.mall_shop_center, "6509337070", "www.goo.gle"));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_shops);

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