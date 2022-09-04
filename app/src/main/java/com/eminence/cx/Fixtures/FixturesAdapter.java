package com.eminence.cx.Fixtures;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.IPL.InfoFragment;
import com.eminence.cx.IPL.MatchesFragment;
import com.eminence.cx.IPL.NewsFragment;
import com.eminence.cx.IPL.OverviewFragment;
import com.eminence.cx.IPL.PointsTableFragment;
import com.eminence.cx.IPL.SquadsFragment;

import org.jetbrains.annotations.NotNull;

public class FixturesAdapter extends FragmentStateAdapter {

    private int COUNT = 3;
    public FixturesAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new SeriesFragment();

            case 2:
                return new TeamsFragment();

            default:
                return new DaysFragment();
        }
    }

    @Override
    public int getItemCount() {
        return COUNT;
    }
}
