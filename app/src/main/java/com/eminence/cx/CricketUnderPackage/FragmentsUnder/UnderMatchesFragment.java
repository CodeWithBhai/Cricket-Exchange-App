package com.eminence.cx.CricketUnderPackage.FragmentsUnder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eminence.cx.R;


public class UnderMatchesFragment extends Fragment {


    public UnderMatchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_under_matches, container, false);

        return view;
    }
}