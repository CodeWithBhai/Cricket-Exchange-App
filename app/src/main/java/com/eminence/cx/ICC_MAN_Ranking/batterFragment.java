package com.eminence.cx.ICC_MAN_Ranking;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eminence.cx.ICC_MAN_Ranking.T20Test.ODIFragment;
import com.eminence.cx.ICC_MAN_Ranking.T20Test.T20Fragment;
import com.eminence.cx.ICC_MAN_Ranking.T20Test.TestFragment;
import com.eminence.cx.R;
public class batterFragment extends Fragment {
    TextView btnFirst, btnSecond, btnThird;
    LinearLayout linearlayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_batter, container, false);
        btnFirst = view.findViewById(R.id.btnFirst);
        btnSecond = view.findViewById(R.id.btnSecond);
        btnThird = view.findViewById(R.id.btnThird);
        linearlayout = view.findViewById(R.id.linearlayout);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ODIFragment odiFragment = new ODIFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, odiFragment);
                transaction.commit();
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T20Fragment t20Fragment = new T20Fragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, t20Fragment);
                transaction.commit();
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestFragment testFragment = new TestFragment();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, testFragment);
                transaction.commit();
            }
        });

        return view;

    }
}
