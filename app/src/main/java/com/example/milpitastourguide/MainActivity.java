package com.example.milpitastourguide;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
    }
}
//        setupViewPager(viewPager);
//
//        viewPager = (ViewPager) findViewById(R.id.view_pager);
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//
//        viewPager.setAdapter(adapter);
//
//        tabLayout.setupWithViewPager(viewPager);
//
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_restaurant);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_local_grocery_store);
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_directions_run);
//        tabLayout.getTabAt(3).setIcon(R.drawable.ic_directions_bike);
//        tabLayout.getTabAt(4).setIcon(R.drawable.ic_local_florist);
//        tabLayout.getTabAt(5).setIcon(R.drawable.ic_child_friendly);
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new RestaurantsFragment(), "");
//        adapter.addFragment(new ShoppingFragment(), "");
//        adapter.addFragment(new WalkingFragment(), "");
//        adapter.addFragment(new BikingFragment(), "");
//        adapter.addFragment(new ParksFragment(), "");
//        adapter.addFragment(new PlaygroundsFragment(), "");
//        viewPager.setAdapter(adapter);
//    }
//
//    //    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////
////        toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
////        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
////
////        viewPager = (ViewPager) findViewById(R.id.viewpager);
////        setupViewPager(viewPager);
////
////        tabLayout = (TabLayout) findViewById(R.id.tabs);
////        tabLayout.setupWithViewPager(viewPager);
////        setupTabIcons();
////    }
////
////    private void setupTabIcons() {
////        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
////        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
////        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
////    }
////
////    private void setupViewPager(ViewPager viewPager) {
////        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
////        adapter.addFrag(new RestaurantsFragment(), "Restaurants");
////        adapter.addFrag(new ShoppingFragment(), "Shopping");
////        adapter.addFrag(new WalkingFragment(), "Walking");
////        adapter.addFrag(new BikingFragment(), "Biking");
////        adapter.addFrag(new ParksFragment(), "Parks");
////        adapter.addFrag(new PlaygroundsFragment(), "Playgrounds");
////        viewPager.setAdapter(adapter);
////    }
////
//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFrag(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }
//}