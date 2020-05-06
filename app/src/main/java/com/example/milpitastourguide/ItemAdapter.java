package com.example.milpitastourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private int mColorResourceId;
    private Button btnPhone, btnSHare, btnGo;


    public ItemAdapter(Context context, ArrayList<Item> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Milpitas} object located at this position in the list
        Item currentItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the facility name from the current Milpitas object and
        // set this text on the name TextView
        nameTextView.setText(currentItem.getInstitutionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the facility address from the current Milpitas object and
        // set this text on the address TextView
        addressTextView.setText(currentItem.getFacilityAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);
        // Get the facility image from the current Milpitas object and
        // set this image on the imageView
        iconView.setImageResource(currentItem.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        btnPhone = (Button) listItemView.findViewById(R.id.btnCall);
        btnSHare = (Button) listItemView.findViewById(R.id.btnShare);
        btnGo = (Button) listItemView.findViewById(R.id.btnGo);

        btnPhone.setBackgroundResource(R.drawable.ic_perm_phone_msg);
        btnSHare.setBackgroundResource(R.drawable.ic_action_share);
        btnGo.setBackgroundResource(R.drawable.ic_action_globe);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}