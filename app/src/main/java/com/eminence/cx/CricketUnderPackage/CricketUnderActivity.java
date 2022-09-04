package com.eminence.cx.CricketUnderPackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.eminence.cx.PlayerVsPlayers.PlayersVsAdapter;
import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

public class CricketUnderActivity extends AppCompatActivity {
    ViewPager2 view_pager;
    TabLayout tab_layout;
    UndreFragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_under);
        getSupportActionBar().hide();

        tab_layout = findViewById(R.id.tablayout_first);
        view_pager = findViewById(R.id.view_pager);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new UndreFragmentAdapter(fragmentManager, getLifecycle());
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