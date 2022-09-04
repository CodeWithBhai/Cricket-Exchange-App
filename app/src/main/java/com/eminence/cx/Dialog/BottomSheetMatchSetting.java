package com.eminence.cx.Dialog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eminence.cx.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import org.jetbrains.annotations.NotNull;

public class BottomSheetMatchSetting extends BottomSheetDialogFragment {
    LinearLayout win_probability, speechSettings;

    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bottom_sheet_match_setting,
                container, false);

        win_probability = view.findViewById(R.id.win_probability);
        speechSettings = view.findViewById(R.id.speechSettings);

        win_probability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetWinPro bottomSheet = new BottomSheetWinPro();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });

        speechSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetSpeechSetting bottomSheet = new BottomSheetSpeechSetting();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });

        return view;
    }
}