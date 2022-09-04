package com.eminence.cx.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.eminence.cx.Models.KetStatModel;
import com.eminence.cx.R;
import com.github.demono.adapter.InfinitePagerAdapter;

import java.util.ArrayList;

public class KeyStatsAdapter extends InfinitePagerAdapter {

    ArrayList<KetStatModel> list;
    Context context;

    public KeyStatsAdapter(ArrayList<KetStatModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public View getItemView(int position, View view, ViewGroup container) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.key_stats_row, container, false);

        ImageView keyImg;
        TextView ketName, keyState, keyScore;

        keyImg = view.findViewById(R.id.keyImg);
        ketName = view.findViewById(R.id.ketName);
        keyScore = view.findViewById(R.id.keyScore);
        keyState = view.findViewById(R.id.keyState);

        ketName.setText(list.get(position).getKetName());
        keyScore.setText(list.get(position).getKeyScore());
        keyState.setText(list.get(position).getKeyState());
        keyImg.setImageResource(list.get(position).getKeyImg());

        return view;
    }
}
