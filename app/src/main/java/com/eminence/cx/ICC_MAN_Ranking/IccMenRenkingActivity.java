package com.eminence.cx.ICC_MAN_Ranking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.eminence.cx.Adapters.FragmentAdapter;
import com.eminence.cx.Adapters.ViewPagerAdapter;
import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class IccMenRenkingActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewpager1;
    FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icc_men_renking);
        getSupportActionBar().hide();

        tabLayout = findViewById(R.id.tab_layout);
        viewpager1 = findViewById(R.id.viewpager1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FragmentAdapter(fragmentManager, getLifecycle());
        viewpager1.setAdapter(adapter);
        tabLayout.addTab(tabLayout.newTab().setText("Team"));
        tabLayout.addTab(tabLayout.newTab().setText("Batter"));
        tabLayout.addTab(tabLayout.newTab().setText("Bowler"));
        tabLayout.addTab(tabLayout.newTab().setText("All Rounder"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewpager1.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
    public void back(View view) {
        onBackPressed();
    }
}