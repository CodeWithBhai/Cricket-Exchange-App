package com.eminence.cx.SinglePlayersDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.eminence.cx.PlayersDetails.PlayersDetailsAdapters;
import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import cn.hugeterry.coordinatortablayout.CoordinatorTabLayout;

public class SinglePlayerActivity extends AppCompatActivity {
    ViewPager2 view_pager;
    TabLayout tab_layout;
    SinglePlayerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        getSupportActionBar().hide();

        tab_layout = findViewById(R.id.tablayout_first);
        view_pager = findViewById(R.id.view_pager);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#eaaf55")));

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new SinglePlayerAdapter(fragmentManager, getLifecycle());
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
        });
    }

    public void back(View view) {
        onBackPressed();
    }
}