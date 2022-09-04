package com.eminence.cx.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.HomeOneFragments.FinishedFragment;
import com.eminence.cx.HomeOneFragments.HomeTwoFragment;
import com.eminence.cx.HomeOneFragments.LiveFragment;
import com.eminence.cx.HomeOneFragments.UpcomingFragment;
import com.eminence.cx.IPL.InfoFragment;
import com.eminence.cx.IPL.MatchesFragment;
import com.eminence.cx.IPL.NewsFragment;
import com.eminence.cx.IPL.OverviewFragment;
import com.eminence.cx.IPL.PointsTableFragment;
import com.eminence.cx.IPL.SquadsFragment;

import org.jetbrains.annotations.NotNull;

public class IplViewPageAdapter extends FragmentStateAdapter {
    private int COUNT = 6;

    public IplViewPageAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new MatchesFragment();

            case 2:
                return new SquadsFragment();

            case 3:
                return new PointsTableFragment();

            case 4:
                return new NewsFragment();

            case 5:
                return new InfoFragment();

            default:
                return new OverviewFragment();
        }

    }

    @Override
    public int getItemCount() {
        return COUNT;
    }

}
