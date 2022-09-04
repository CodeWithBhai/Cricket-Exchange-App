package com.eminence.cx.SinglePlayersDetails;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.eminence.cx.SinglePlayersDetails.Fragments.SingleMatchFrag;
import com.eminence.cx.SinglePlayersDetails.Fragments.SingleNewsFrag;
import com.eminence.cx.SinglePlayersDetails.Fragments.SingleOverViewFrag;
import com.eminence.cx.SinglePlayersDetails.Fragments.SinglePlayerFrag;

public class SinglePlayerAdapter extends FragmentStateAdapter {
    public SinglePlayerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new SingleOverViewFrag();

            case 1:
                return new SingleMatchFrag();

            case 2:
                return new SingleNewsFrag();

            case 3:
                return new SinglePlayerFrag();

            default:
                return new SingleOverViewFrag();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
