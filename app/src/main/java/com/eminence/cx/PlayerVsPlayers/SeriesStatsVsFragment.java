package com.eminence.cx.PlayerVsPlayers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.eminence.cx.R;


public class SeriesStatsVsFragment extends Fragment {

    Switch on_off_switch;
    LinearLayout formVisible, defaultVisible;
    public SeriesStatsVsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_series_stats_vs, container, false);

        on_off_switch = view.findViewById(R.id.on_off_switch);
        defaultVisible = view.findViewById(R.id.defaultVisible);
        formVisible = view.findViewById(R.id.formVisible);
        on_off_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (on_off_switch.isChecked()){
                    formVisible.setVisibility(View.VISIBLE);
                    defaultVisible.setVisibility(View.GONE);
                } else {
                    defaultVisible.setVisibility(View.VISIBLE);
                    formVisible.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }
}