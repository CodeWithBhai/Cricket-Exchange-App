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

import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){

            case 1:
                return new HomeTwoFragment();

            case 2:
                return new FinishedFragment();

            case 3:
                return new UpcomingFragment();

            default:
                return new LiveFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
