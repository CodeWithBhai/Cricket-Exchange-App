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

import com.eminence.cx.Adapters.SliderAdapter;
import com.eminence.cx.PlayerVsPlayers.LiveVsFragment;
import com.eminence.cx.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class FinishedFragment extends Fragment {

    LinearLayout finish_live_fragment;

    Button arrowDown,arrowDown1, arrowDown2, arrowDown3, arrowDown4,
            arrowDown5;
    LinearLayout cardView, cardView1, cardView2, cardView3, cardView4, cardView5, expandable, expandable1,
            expandable2, expandable3, expandable4, expandable5;
    SliderView sliderView;
    int[] images = {R.drawable.chessimgone, R.drawable.chessimgtwo, R.drawable.chessimhthree, R.drawable.chessimgone, R.drawable.chessimgtwo};


    public FinishedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_finished, container, false);
       // finish_live_fragment=view.findViewById(R.id.finish_live_fragment);

        arrowDown=view.findViewById(R.id.arrowDown);
        expandable=view.findViewById(R.id.expandable);
        cardView=view.findViewById(R.id.cardView);

        arrowDown1=view.findViewById(R.id.arrowDown1);
        cardView1=view.findViewById(R.id.cardView1);
        expandable1=view.findViewById(R.id.expandable1);

        arrowDown2=view.findViewById(R.id.arrowDown2);
        cardView2=view.findViewById(R.id.cardView2);
        expandable2=view.findViewById(R.id.expandable2);

        //arrowDown5=view.findViewById(R.id.arrowDown5);
        cardView5=view.findViewById(R.id.cardView5);
        expandable5=view.findViewById(R.id.expandable5);

        /*finish_live_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LiveVsFragment.class);
                startActivity(intent);
            }
        });*/

        return view;
    }
}