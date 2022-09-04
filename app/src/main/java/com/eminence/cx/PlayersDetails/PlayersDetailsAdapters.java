package com.eminence.cx.PlayersDetails;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.CricketUnderPackage.FragmentsUnder.UnderPointsTableFragment;
import com.eminence.cx.PlayersDetails.Fragments.BestEconomyFragment;
import com.eminence.cx.PlayersDetails.Fragments.BestFiguresFragment;
import com.eminence.cx.PlayersDetails.Fragments.BestStrickeRateFragment;
import com.eminence.cx.PlayersDetails.Fragments.HighestScoreFragment;
import com.eminence.cx.PlayersDetails.Fragments.MostFantasypointsFragment;
import com.eminence.cx.PlayersDetails.Fragments.MostRunsFragment;
import com.eminence.cx.PlayersDetails.Fragments.MostSixesFragment;
import com.eminence.cx.PlayersDetails.Fragments.MostWicketFragment;

public class PlayersDetailsAdapters extends FragmentStateAdapter {
    public PlayersDetailsAdapters(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new MostRunsFragment();

            case 1:
                return new MostWicketFragment();

            case 2:
                return new MostSixesFragment();

            case 3:
                return new HighestScoreFragment();

            case 4:
                return new BestFiguresFragment();

            case 5:
                return new BestStrickeRateFragment();

            case 6:
                return new BestEconomyFragment();

            default:
                return new MostRunsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
