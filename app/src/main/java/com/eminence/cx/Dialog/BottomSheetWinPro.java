package com.eminence.cx.Dialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.eminence.cx.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.jetbrains.annotations.NotNull;

public class BottomSheetWinPro extends BottomSheetDialogFragment {
    ImageView number_view_visible, win_visible;
    LinearLayout showAll, circleWin, NumberCircle;

    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bottom_sheet_win_pro,
                container, false);

        number_view_visible = view.findViewById(R.id.number_view_visible);
        win_visible = view.findViewById(R.id.win_visible);
        showAll = view.findViewById(R.id.showAll);
        circleWin = view.findViewById(R.id.circleWin);
        NumberCircle = view.findViewById(R.id.NumberCircle);

        circleWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                win_visible.setVisibility(View.VISIBLE);
                number_view_visible.setVisibility(View.GONE);
                showAll.setVisibility(View.GONE);
            }
        });

        NumberCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                win_visible.setVisibility(View.GONE);
                number_view_visible.setVisibility(View.VISIBLE);
                showAll.setVisibility(View.VISIBLE);
            }
        });


        return view;
    }
}