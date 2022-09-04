package com.eminence.cx.Fixtures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;

import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

public class FixtureTwoActivity extends AppCompatActivity {

   /* ViewPager2 view_pager;
    ViewPager view_pager2;
    TabLayout tab_layout;
    FixturesAdapter adapter;
    TextView international, t20;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixture_two);
        getSupportActionBar().hide();
/*
        tab_layout = findViewById(R.id.tab_layout);
        view_pager = findViewById(R.id.view_pager);
        international = findViewById(R.id.international);
        t20 = findViewById(R.id.t20);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FixturesAdapter(fragmentManager, getLifecycle());
        view_pager.setAdapter(adapter);

        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        view_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tab_layout.selectTab(tab_layout.getTabAt(position));
            }
        });*/
    }
}