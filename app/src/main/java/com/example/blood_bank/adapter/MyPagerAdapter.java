package com.example.blood_bank.adapter;

import com.example.blood_bank.R;
import com.example.blood_bank.view.fragment.FragmentViewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return FragmentViewPager.newInstance(R.drawable.ic_group_84, R.drawable.splash_cycle_1, R.drawable.ic_slider_ok_btn);
            default:
                return FragmentViewPager.newInstance(R.drawable.ic_group_85, R.drawable.splash_cylce_2, R.drawable.ic_slider_arrow_btn);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

