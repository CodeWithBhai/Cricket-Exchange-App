package com.eminence.cx.PlayerVsPlayers;

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

public class PlayersVsAdapter extends FragmentStateAdapter {
    private int COUNT = 6;
    public PlayersVsAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new InfoVsFragment();

            case 1:
                return new CommentaryVsFragment();

            case 2:
                return new LiveVsFragment();

            case 3:
                return new ScorecardVsFragment();

            case 4:
                return new GraphsVsFragment();

            case 5:
                return new SeriesStatsVsFragment();

            default:
                return new InfoVsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return COUNT;
    }
}
