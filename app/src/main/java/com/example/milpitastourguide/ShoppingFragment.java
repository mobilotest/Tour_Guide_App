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

        // Create an array of words TODO:buttons with links to Phone, Web and Email intents
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.shopping_greatmall), getString(R.string.shopping_greatmall_address), R.drawable.great_mall, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.shopping_crescentsquare), getString(R.string.shopping_crescentsquare_address), R.drawable.crescent_sqare, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.shopping_calaverasplaza), getString(R.string.shopping_calaverasplaza_address), R.drawable.calaveras_plaza, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.shopping_milpitascenter), getString(R.string.shopping_milpitascenter_address), R.drawable.center, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.shopping_milpitastowncenter), getString(R.string.shopping_milpitastowncenter_address), R.drawable.town_center, "6509337070", "www.goo.gle"));
        items.add(new Item(getString(R.string.shopping_milpitasmallshoppingcenter), getString(R.string.shopping_milpitasmallshoppingcenter_address), R.drawable.mall_shop_center, "6509337070", "www.goo.gle"));

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
