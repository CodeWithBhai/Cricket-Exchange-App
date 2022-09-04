package com.eminence.cx.PlayerVsPlayers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.eminence.cx.Adapters.ViewPagerAdapter;
import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

public class VsFragment extends Fragment {
    ViewPager2 view_pager;
    TabLayout tab_layout;
    PlayersVsAdapter adapter;

    public VsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vs, container, false);


        return view;
    }
}