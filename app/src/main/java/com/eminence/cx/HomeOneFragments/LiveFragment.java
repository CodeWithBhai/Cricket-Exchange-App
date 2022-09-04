package com.eminence.cx.HomeOneFragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eminence.cx.PlayerVsPlayers.LiveVsFragment;
import com.eminence.cx.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import ir.samanjafari.easycountdowntimer.EasyCountDownTextview;

public class LiveFragment extends Fragment {
    Button arrowDown1;
    LinearLayout cardView1, expandable1;
    LinearLayout player_live_fragment;


    public LiveFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout player_live_fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_live, container, false);
        //textView = view.findViewById(R.id.textView);

        arrowDown1=view.findViewById(R.id.arrowDown1);
        cardView1=view.findViewById(R.id.cardView1);
        expandable1=view.findViewById(R.id.expandable1);


       // player_live_fragment=view.findViewById(R.id.player_live_fragment);

       /* player_live_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LiveVsFragment.class);
                startActivity(intent);
            }
        });*/

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

       /* new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                NumberFormat f = new DecimalFormat("00");
                long hours = (millisUntilFinished/3600000)%48;
                long min = (millisUntilFinished / 60000) % 60;
                long sec = (millisUntilFinished / 1000) % 60;
                textView.setText(f.format(hours) + ":" + f.format(min) + ":" + f.format(sec));
            }

            @Override
            public void onFinish() {
                textView.setText("00:00:00");
            }
        }.start();
*/
        return view;

    }
}