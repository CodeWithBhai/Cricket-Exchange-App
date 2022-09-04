package com.eminence.cx.PlayerVsPlayers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.eminence.cx.R;

public class ScorecardVsFragment extends Fragment {

    Button arrowDown12345, arrowDown123456, arrowDown1234567;
    LinearLayout cardView12345, cardView123456, cardView1234567, expandable12345, expandable123456, expandable1234567;
    View invisibleLine, invisibleLine1;



    public ScorecardVsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_scorecard_vs, container, false);

        arrowDown12345=view.findViewById(R.id.arrowDown12345);
        cardView12345=view.findViewById(R.id.cardView12345);
        expandable12345=view.findViewById(R.id.expandable12345);

        arrowDown123456=view.findViewById(R.id.arrowDown123456);
        cardView123456=view.findViewById(R.id.cardView123456);
        expandable123456=view.findViewById(R.id.expandable123456);

        arrowDown1234567=view.findViewById(R.id.arrowDown1234567);
        cardView1234567=view.findViewById(R.id.cardView1234567);
        expandable1234567=view.findViewById(R.id.expandable1234567);

        invisibleLine=view.findViewById(R.id.invisibleLine);
        invisibleLine1=view.findViewById(R.id.invisibleLine1);

        arrowDown12345.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable12345.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView12345, new AutoTransition());
                    expandable12345.setVisibility(View.VISIBLE);
                    invisibleLine.setVisibility(View.INVISIBLE);
                    arrowDown12345.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView12345, new AutoTransition());
                    expandable12345.setVisibility(View.GONE);
                    invisibleLine.setVisibility(View.VISIBLE);
                    arrowDown12345.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        arrowDown123456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable123456.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView123456, new AutoTransition());
                    expandable123456.setVisibility(View.VISIBLE);
                    invisibleLine1.setVisibility(View.INVISIBLE);
                    arrowDown123456.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView123456, new AutoTransition());
                    expandable123456.setVisibility(View.GONE);
                    invisibleLine1.setVisibility(View.VISIBLE);
                    arrowDown123456.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        arrowDown1234567.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable1234567.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1234567, new AutoTransition());
                    expandable1234567.setVisibility(View.VISIBLE);
                    invisibleLine1.setVisibility(View.INVISIBLE);
                    arrowDown1234567.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView1234567, new AutoTransition());
                    expandable1234567.setVisibility(View.GONE);
                    invisibleLine1.setVisibility(View.VISIBLE);
                    arrowDown1234567.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        return view;
    }
}