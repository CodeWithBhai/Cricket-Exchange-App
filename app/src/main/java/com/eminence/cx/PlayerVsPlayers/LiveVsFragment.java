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

public class LiveVsFragment extends Fragment {
    LinearLayout cardView123, scor_expandible123;
    Button arrowDown123;

    LinearLayout cardView1234, scor_expandible1234;
    Button arrowDown1234;



    public LiveVsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live_vs, container, false);
        scor_expandible123 = view.findViewById(R.id.scor_expandible123);
        cardView123 = view.findViewById(R.id.cardView123);
        arrowDown123 = view.findViewById(R.id.arrowDown123);
        scor_expandible1234 = view.findViewById(R.id.scor_expandible1234);
        cardView1234 = view.findViewById(R.id.cardView1234);
        arrowDown1234 = view.findViewById(R.id.arrowDown1234);

        arrowDown123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scor_expandible123.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView123, new AutoTransition());
                    scor_expandible123.setVisibility(View.VISIBLE);
                    arrowDown123.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView123, new AutoTransition());
                    scor_expandible123.setVisibility(View.GONE);
                    arrowDown123.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        arrowDown1234.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scor_expandible1234.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1234, new AutoTransition());
                    scor_expandible1234.setVisibility(View.VISIBLE);
                    arrowDown1234.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView1234, new AutoTransition());
                    scor_expandible1234.setVisibility(View.GONE);
                    arrowDown1234.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        return view;
    }
}