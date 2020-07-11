package com.example.blood_bank.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.blood_bank.R;
import com.example.blood_bank.R2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentViewPager extends Base_Fragment {
    @BindView(R.id.fragment_view_pager_base_image)
    ImageView fragmentViewPagerBaseImage;
    @BindView(R.id.fragment_view_pager_cycle1)
    ImageView fragmentViewPagerCycle1;
    @BindView(R.id.fragment_view_pager_cycle2)
    ImageView fragmentViewPagerCycle2;
    @BindView(R.id.fragment_view_pager_arrow)
    ImageView fragmentViewPagerArrow;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setUpActivity();
        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
        ButterKnife.bind(this, view);
        fragmentViewPagerBaseImage.setImageResource(getArguments().getInt("img"));
        fragmentViewPagerArrow.setImageResource(getArguments().getInt("arrow"));
        fragmentViewPagerCycle2.setImageResource(getArguments().getInt("cycle"));

        return view;

    }

    public static FragmentViewPager newInstance(int image , int image_cycle , int arrow_image) {

        FragmentViewPager f = new FragmentViewPager();
        Bundle b = new Bundle();
        b.putInt("img", image);
        b.putInt("cycle",image_cycle);
        b.putInt("arrow",arrow_image);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onBack() {
        super.onBack();
    }
}

