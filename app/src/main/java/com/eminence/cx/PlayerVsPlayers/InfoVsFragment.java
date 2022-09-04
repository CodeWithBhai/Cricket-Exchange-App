package com.eminence.cx.PlayerVsPlayers;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.eminence.cx.CricketUnderPackage.CricketUnderActivity;
import com.eminence.cx.R;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class InfoVsFragment extends Fragment {

    Button arrowDown1, arrowDown2;
    LinearLayout cardView1, cardView2, expandable1,
            expandable2, underShow;


    public InfoVsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info_vs, container, false);

        PieChart mPieChart = (PieChart) view.findViewById(R.id.piechart);

        mPieChart.addPieSlice(new PieModel("Freetime", 15, Color.parseColor("#FE6DA8")));
        mPieChart.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#56B7F1")));
        mPieChart.addPieSlice(new PieModel("Work", 35, Color.parseColor("#CDA67F")));
        mPieChart.addPieSlice(new PieModel("Eating", 9, Color.parseColor("#FED70E")));

        mPieChart.startAnimation();

        arrowDown1=view.findViewById(R.id.arrowDown1);
        cardView1=view.findViewById(R.id.cardView1);
        expandable1=view.findViewById(R.id.expandable1);
        underShow=view.findViewById(R.id.underShow);

        arrowDown2=view.findViewById(R.id.arrowDown2);
        cardView2=view.findViewById(R.id.cardView2);
        expandable2=view.findViewById(R.id.expandable2);

        arrowDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandable1.setVisibility(View.VISIBLE);
                    arrowDown1.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandable1.setVisibility(View.GONE);
                    arrowDown1.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        arrowDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandable2.setVisibility(View.VISIBLE);
                    arrowDown2.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandable2.setVisibility(View.GONE);
                    arrowDown2.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        underShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CricketUnderActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}