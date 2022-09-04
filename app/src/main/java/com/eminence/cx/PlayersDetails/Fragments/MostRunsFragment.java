package com.eminence.cx.PlayersDetails.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eminence.cx.R;
import com.eminence.cx.SinglePlayersDetails.SinglePlayerActivity;

public class MostRunsFragment extends Fragment {
    LinearLayout playerSingle;


    public MostRunsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_most_runs, container, false);

        playerSingle = view.findViewById(R.id.playerSingle);
        playerSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SinglePlayerActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}