package com.eminence.cx.Fixtures.InnerFragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.Fixtures.DaysFragment;
import com.eminence.cx.Fixtures.SeriesFragment;
import com.eminence.cx.Fixtures.TeamsFragment;
import com.eminence.cx.Fixtures.WomenDayFragment;

import org.jetbrains.annotations.NotNull;

public class FixtureInnerAdapter extends FragmentStateAdapter {
    public FixtureInnerAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 1:
                return new InternationalDayFragment();

            case 2:
                return new T20DayFragment();

            case 3:
                return new OdiDayFragment();

            case 4:
                return new TestDayFragment();

            case 5:
                return new LeagueDayFragment();

            case 6:
                return new WomenDayFragment();

            default:
                return new AllDayFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
