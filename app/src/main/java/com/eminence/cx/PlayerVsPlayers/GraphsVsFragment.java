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

public class GraphsVsFragment extends Fragment {

    LinearLayout cardScore, cardScore1, expandibleOver, expandibleOver1;
    View invisibleScoreLine, invisibleScoreLine1;
    Button downUpArrow, downUpArrow1;


    public GraphsVsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_graphs_vs, container, false);

        cardScore= view.findViewById(R.id.cardScore);
        expandibleOver= view.findViewById(R.id.expandibleOver);
        downUpArrow= view.findViewById(R.id.downUpArrow);
        invisibleScoreLine= view.findViewById(R.id.invisibleScoreLine);

        cardScore1= view.findViewById(R.id.cardScore1);
        expandibleOver1= view.findViewById(R.id.expandibleOver1);
        downUpArrow1= view.findViewById(R.id.downUpArrow1);
        invisibleScoreLine1= view.findViewById(R.id.invisibleScoreLine1);

        downUpArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandibleOver.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardScore, new AutoTransition());
                    expandibleOver.setVisibility(View.VISIBLE);
                    invisibleScoreLine.setVisibility(View.INVISIBLE);
                    downUpArrow.setBackgroundResource(R.drawable.ic_baseline_arrow_drop_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardScore, new AutoTransition());
                    expandibleOver.setVisibility(View.GONE);
                    invisibleScoreLine.setVisibility(View.VISIBLE);
                    downUpArrow.setBackgroundResource(R.drawable.ic_baseline_arrow_drop_down_24);
                }
            }
        });
        downUpArrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandibleOver1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardScore1, new AutoTransition());
                    expandibleOver1.setVisibility(View.VISIBLE);
                    invisibleScoreLine1.setVisibility(View.INVISIBLE);
                    downUpArrow1.setBackgroundResource(R.drawable.ic_baseline_arrow_drop_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardScore1, new AutoTransition());
                    expandibleOver1.setVisibility(View.GONE);
                    invisibleScoreLine1.setVisibility(View.VISIBLE);
                    downUpArrow1.setBackgroundResource(R.drawable.ic_baseline_arrow_drop_down_24);
                }
            }
        });

        return view;
    }
}