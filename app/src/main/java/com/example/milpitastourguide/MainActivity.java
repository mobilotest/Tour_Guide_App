package com.example.milpitastourguide;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    Button btnPhone;
    Button btnSHare;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        btnPhone.setBackgroundResource(R.drawable.ic_perm_phone_msg);
//        btnSHare.setBackgroundResource(R.drawable.ic_action_share);
//        btnGo.setBackgroundResource(R.drawable.ic_action_globe);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_restaurant);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_local_grocery_store);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_directions_run);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_directions_bike);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_local_florist);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_child_friendly);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RestaurantsFragment(), "");
        adapter.addFragment(new ShoppingFragment(), "");
        adapter.addFragment(new WalkingFragment(), "");
        adapter.addFragment(new BikingFragment(), "");
        adapter.addFragment(new ParksFragment(), "");
        adapter.addFragment(new PlaygroundsFragment(), "");
        viewPager.setAdapter(adapter);
    }
}