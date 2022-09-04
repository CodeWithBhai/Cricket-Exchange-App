package com.eminence.cx.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.ICC_MAN_Ranking.AllRounderFragment;
import com.eminence.cx.ICC_MAN_Ranking.BowerFragment;
import com.eminence.cx.ICC_MAN_Ranking.TeamFragment;
import com.eminence.cx.ICC_MAN_Ranking.batterFragment;

import org.jetbrains.annotations.NotNull;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new batterFragment();
            case 2:
                return new BowerFragment();
            case 3:
                return new TeamFragment();
            default:
                return new AllRounderFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
