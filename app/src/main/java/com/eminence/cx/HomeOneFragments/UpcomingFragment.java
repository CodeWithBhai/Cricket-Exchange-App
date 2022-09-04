package com.eminence.cx.HomeOneFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eminence.cx.PlayerVsPlayers.InfoVsFragment;
import com.eminence.cx.R;

public class UpcomingFragment extends Fragment {
    LinearLayout upcoming_info_fragment;

    public UpcomingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);
       /* upcoming_info_fragment = view.findViewById(R.id.upcoming_info_fragment);

        upcoming_info_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), InfoVsFragment.class);
                startActivity(intent);
            }
        });*/
        return view;
    }
}