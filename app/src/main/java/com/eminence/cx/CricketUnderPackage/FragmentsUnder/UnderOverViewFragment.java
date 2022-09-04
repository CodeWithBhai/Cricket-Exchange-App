package com.eminence.cx.CricketUnderPackage.FragmentsUnder;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.eminence.cx.Adapters.KeyStatsAdapter;
import com.eminence.cx.Models.KetStatModel;
import com.eminence.cx.PlayersDetails.PlayersDetailsActivity;
import com.eminence.cx.R;
import com.github.demono.AutoScrollViewPager;

import java.util.ArrayList;

public class UnderOverViewFragment extends Fragment {
    Switch on_off_switch;
    LinearLayout formVisible, defaultVisible, playerDetails;
    AutoScrollViewPager recipiviewpager;
    ArrayList<KetStatModel> list = new ArrayList<>();
    public UnderOverViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_under_over_view, container, false);

        on_off_switch = view.findViewById(R.id.on_off_switch);
        defaultVisible = view.findViewById(R.id.defaultVisible);
        formVisible = view.findViewById(R.id.formVisible);
        recipiviewpager = view.findViewById(R.id.recipiviewpager);
        playerDetails = view.findViewById(R.id.playerDetails);

        on_off_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (on_off_switch.isChecked()){
                    formVisible.setVisibility(View.VISIBLE);
                    defaultVisible.setVisibility(View.GONE);
                } else {
                    defaultVisible.setVisibility(View.VISIBLE);
                    formVisible.setVisibility(View.GONE);
                }
            }
        });

        playerDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlayersDetailsActivity.class);
                startActivity(intent);
            }
        });

        //keyStatViewPager();
        //initData();

        return view;
    }

    private void initData() {
        list = new ArrayList<>();
        list.add(new KetStatModel("1", "Zulfikar", "Canada", "234.34", R.drawable.ipsimg));
        list.add(new KetStatModel("2", "Zulfikar", "Canada", "234.34", R.drawable.ipsimg));
        list.add(new KetStatModel("3", "Zulfikar", "Canada", "234.34", R.drawable.ipsimg));
    }

    private void keyStatViewPager() {
        KeyStatsAdapter adapter = new KeyStatsAdapter(list, getContext());
        recipiviewpager.setAdapter(adapter);
        recipiviewpager.startAutoScroll();
        recipiviewpager.setSlideDuration(2 * 1000);
        recipiviewpager.setSlideInterval(3 * 1000);
        adapter.notifyDataSetChanged();
        recipiviewpager.setVisibility(View.VISIBLE);
    }
}