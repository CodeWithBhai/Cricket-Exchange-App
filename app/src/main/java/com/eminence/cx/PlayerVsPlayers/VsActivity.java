package com.eminence.cx.PlayerVsPlayers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.eminence.cx.Dialog.BottomSheetDialog;
import com.eminence.cx.Dialog.BottomSheetSpeechSetting;
import com.eminence.cx.R;
import com.google.android.material.tabs.TabLayout;

public class VsActivity extends AppCompatActivity {

    ViewPager2 view_pager;
    TabLayout tab_layout;
    PlayersVsAdapter adapter;
    ImageView settingBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs);
        getSupportActionBar().hide();

        tab_layout = findViewById(R.id.tablayout_first);
        view_pager = findViewById(R.id.view_pager);
        settingBottomSheet = findViewById(R.id.settingBottomSheet);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new PlayersVsAdapter(fragmentManager, getLifecycle());
        view_pager.setAdapter(adapter);

        settingBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetSpeechSetting bottomSheet = new BottomSheetSpeechSetting();
                bottomSheet.show(getSupportFragmentManager(),
                        "ModalBottomSheet");
            }
        });


        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        view_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tab_layout.selectTab(tab_layout.getTabAt(position));
            }
        });
    }
    public void back(View view) {
        onBackPressed();
    }
}