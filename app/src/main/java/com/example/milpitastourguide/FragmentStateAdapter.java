package com.example.milpitastourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * {@link FragmentStateAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Item} objects.
 */
public class FragmentStateAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link FragmentStateAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public FragmentStateAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
            if (position == 0) {
                return new RestaurantsFragment();
            } else if (position == 1) {
                return new ShoppingFragment();
            } else if (position == 2) {
                return new WalkingFragment();
            } else if (position == 3) {
                return new BikingFragment();
            } else if (position == 4) {
                return new ParksFragment();
            } else {
                return new PlaygroundsFragment();
            }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return mContext.getString(R.string.category_shops);
        } else if (position == 2) {
            return mContext.getString(R.string.category_walking);
        } else if (position == 3) {
            return mContext.getString(R.string.category_biking);
        } else if (position == 4) {
            return mContext.getString(R.string.category_parks);
        } else {
            return mContext.getString(R.string.category_playgrounds);
        }
    }
}