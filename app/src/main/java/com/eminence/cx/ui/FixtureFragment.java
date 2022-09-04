package com.eminence.cx.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eminence.cx.Adapters.IplViewPageAdapter;
import com.eminence.cx.Fixtures.FixturesAdapter;
import com.eminence.cx.Fixtures.InnerFragments.AllDayFragment;
import com.eminence.cx.Fixtures.InnerFragments.FixtureInnerAdapter;
import com.eminence.cx.Fixtures.InnerFragments.InternationalDayFragment;
import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

public class FixtureFragment extends Fragment {
    ViewPager2 view_pager;
    ViewPager2 view_pager2;
    TabLayout tab_layout;
    FixturesAdapter adapter;
    TextView international, t20;

    public FixtureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fixture, container, false);

        tab_layout = view.findViewById(R.id.tab_layout);
        view_pager = view.findViewById(R.id.view_pager);
        international = view.findViewById(R.id.international);

        FragmentManager fragmentManager = getChildFragmentManager();
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
        });

        return view;
    }
}