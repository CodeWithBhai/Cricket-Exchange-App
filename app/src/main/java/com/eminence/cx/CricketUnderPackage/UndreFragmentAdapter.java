package com.eminence.cx.CricketUnderPackage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderInfoFragment;
import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderMatchesFragment;
import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderNewsFragment;
import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderOverViewFragment;
import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderPointsTableFragment;
import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderSquadsFragment;
import com.eminence.cx.PlayerVsPlayers.CommentaryVsFragment;
import com.eminence.cx.PlayerVsPlayers.FantasyVsFragment;
import com.eminence.cx.PlayerVsPlayers.GraphsVsFragment;
import com.eminence.cx.PlayerVsPlayers.InfoVsFragment;
import com.eminence.cx.PlayerVsPlayers.LiveVsFragment;
import com.eminence.cx.PlayerVsPlayers.ScorecardVsFragment;
import com.eminence.cx.PlayerVsPlayers.SeriesStatsVsFragment;

public class UndreFragmentAdapter extends FragmentStateAdapter {
    public UndreFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new UnderOverViewFragment();

            case 1:
                return new UnderMatchesFragment();

            case 2:
                return new UnderSquadsFragment();

            case 3:
                return new UnderPointsTableFragment();

            case 4:
                return new UnderNewsFragment();

            case 5:
                return new UnderInfoFragment();

            default:
                return new UnderOverViewFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
