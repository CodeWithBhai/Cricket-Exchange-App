package com.eminence.cx.Fixtures;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eminence.cx.Fixtures.InnerFragments.AllDayFragment;
import com.eminence.cx.Fixtures.InnerFragments.InternationalDayFragment;
import com.eminence.cx.Fixtures.InnerFragments.LeagueDayFragment;
import com.eminence.cx.Fixtures.InnerFragments.OdiDayFragment;
import com.eminence.cx.Fixtures.InnerFragments.T20DayFragment;
import com.eminence.cx.Fixtures.InnerFragments.TestDayFragment;
import com.eminence.cx.ICC_MAN_Ranking.T20Test.T20Fragment;
import com.eminence.cx.R;

public class TeamsFragment extends Fragment {


    public TeamsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teams, container, false);


        return view;
    }
}