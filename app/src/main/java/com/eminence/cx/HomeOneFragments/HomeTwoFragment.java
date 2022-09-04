package com.eminence.cx.HomeOneFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eminence.cx.PlayerVsPlayers.LiveVsFragment;
import com.eminence.cx.PlayerVsPlayers.VsActivity;
import com.eminence.cx.PlayerVsPlayers.VsFragment;
import com.eminence.cx.R;

public class HomeTwoFragment extends Fragment {
    TextView playerVsHome;
    Button arrowDown,arrowDown1, arrowDown2, arrowDown3, arrowDown4,
            arrowDown5;
    LinearLayout cardView, cardView1, cardView2, cardView3, cardView4, cardView5, expandable, expandable1,
            expandable2, expandable3, expandable4, expandable5;

    LinearLayout firstLayoutNextPage;
    View invisibleLine, invisibleLine2, invisibleLine3, invisibleLine4, invisibleLine1, invisibleLine5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_two, container, false);
        firstLayoutNextPage=view.findViewById(R.id.firstLayoutNextPage);

        arrowDown=view.findViewById(R.id.arrowDown);
        expandable=view.findViewById(R.id.expandable);
        cardView=view.findViewById(R.id.cardView);
        playerVsHome=view.findViewById(R.id.playerVsHome);

        invisibleLine=view.findViewById(R.id.invisibleLine);
        invisibleLine1=view.findViewById(R.id.invisibleLine1);
        invisibleLine2=view.findViewById(R.id.invisibleLine2);
        invisibleLine3=view.findViewById(R.id.invisibleLine3);
        invisibleLine4=view.findViewById(R.id.invisibleLine4);
        invisibleLine5=view.findViewById(R.id.invisibleLine5);

        arrowDown1=view.findViewById(R.id.arrowDown1);
        cardView1=view.findViewById(R.id.cardView1);
        expandable1=view.findViewById(R.id.expandable1);

        arrowDown2=view.findViewById(R.id.arrowDown2);
        cardView2=view.findViewById(R.id.cardView2);
        expandable2=view.findViewById(R.id.expandable2);

        arrowDown3=view.findViewById(R.id.arrowDown3);
        cardView3=view.findViewById(R.id.cardView3);
        expandable3=view.findViewById(R.id.expandable3);

        arrowDown4=view.findViewById(R.id.arrowDown4);
        cardView4=view.findViewById(R.id.cardView4);
        expandable4=view.findViewById(R.id.expandable4);

        arrowDown5=view.findViewById(R.id.arrowDown5);
        cardView5=view.findViewById(R.id.cardView5);
        expandable5=view.findViewById(R.id.expandable5);

        firstLayoutNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VsActivity.class);
                startActivity(intent);
            }
        });

        arrowDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandable.setVisibility(View.VISIBLE);
                    invisibleLine.setVisibility(View.INVISIBLE);
                    arrowDown.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }

                else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandable.setVisibility(View.GONE);
                    invisibleLine.setVisibility(View.VISIBLE);
                    arrowDown.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        arrowDown1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandable1.setVisibility(View.VISIBLE);
                    invisibleLine1.setVisibility(View.INVISIBLE);
                    arrowDown1.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandable1.setVisibility(View.GONE);
                    invisibleLine1.setVisibility(View.VISIBLE);
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
                    invisibleLine2.setVisibility(View.INVISIBLE);
                    arrowDown2.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandable2.setVisibility(View.GONE);
                    invisibleLine2.setVisibility(View.VISIBLE);
                    arrowDown2.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        arrowDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandable3.setVisibility(View.VISIBLE);
                    invisibleLine3.setVisibility(View.INVISIBLE);
                    arrowDown3.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandable3.setVisibility(View.GONE);
                    invisibleLine3.setVisibility(View.VISIBLE);
                    arrowDown3.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        arrowDown4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable4.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    expandable4.setVisibility(View.VISIBLE);
                    invisibleLine4.setVisibility(View.INVISIBLE);
                    arrowDown4.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    expandable4.setVisibility(View.GONE);
                    invisibleLine4.setVisibility(View.VISIBLE);
                    arrowDown4.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        arrowDown5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandable5.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    expandable5.setVisibility(View.VISIBLE);
                    invisibleLine5.setVisibility(View.INVISIBLE);
                    arrowDown5.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    expandable5.setVisibility(View.GONE);
                    invisibleLine5.setVisibility(View.VISIBLE);
                    arrowDown5.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });
        return view;

    }

}