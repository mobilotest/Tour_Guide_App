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
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RestaurantsFragment(), "");
        adapter.addFragment(new ShoppingFragment(), "");
        adapter.addFragment(new WalkingFragment(), "");
        adapter.addFragment(new BikingFragment(), "");
        adapter.addFragment(new ParksFragment(), "");
        adapter.addFragment(new PlaygroundsFragment(), "");

        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_restaurant);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_local_grocery_store);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_directions_run);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_directions_bike);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_local_florist);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_child_friendly);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        setupViewPager(viewPager);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//        setupTabIcons();
//    }
//
//    private void setupTabIcons() {
//        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
//        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
//        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFrag(new RestaurantsFragment(), "Restaurants");
//        adapter.addFrag(new ShoppingFragment(), "Shopping");
//        adapter.addFrag(new WalkingFragment(), "Walking");
//        adapter.addFrag(new BikingFragment(), "Biking");
//        adapter.addFrag(new ParksFragment(), "Parks");
//        adapter.addFrag(new PlaygroundsFragment(), "Playgrounds");
//        viewPager.setAdapter(adapter);
//    }
//
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
}