package com.example.blood_bank.view.fragment;

import com.example.blood_bank.view.activity.Base_Activity;

import androidx.fragment.app.Fragment;

public class Base_Fragment extends Fragment {
    public Base_Activity baseActivity;

    public void setUpActivity() {
        baseActivity = (Base_Activity) getActivity();

        baseActivity.baseFragment = this;
    }

    public void onBack() {
        baseActivity.superBackPressed();
    }

}

