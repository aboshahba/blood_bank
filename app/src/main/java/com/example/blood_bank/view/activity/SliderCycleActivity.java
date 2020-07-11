package com.example.blood_bank.view.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.blood_bank.R;
import com.example.blood_bank.adapter.MyPagerAdapter;
import com.example.blood_bank.helper.HelperMethods;

import androidx.annotation.RequiresApi;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SliderCycleActivity extends Base_Activity {


    @BindView(R.id.pager)
    ViewPager pager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        HelperMethods.changeLang(this, "ar");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == pager.getAdapter().getCount() - 1) {
                    Intent mainIntent = new Intent(SliderCycleActivity.this, LoginCycleActivity.class);
                    SliderCycleActivity.this.startActivity(mainIntent);
                    SliderCycleActivity.this.finish();
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.parseColor("#cbcbca"));
    }

}




