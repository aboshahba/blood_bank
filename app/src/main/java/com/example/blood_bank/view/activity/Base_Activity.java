package com.example.blood_bank.view.activity;

import com.example.blood_bank.view.fragment.Base_Fragment;

import androidx.appcompat.app.AppCompatActivity;

public class Base_Activity extends AppCompatActivity {

    public Base_Fragment baseFragment ;

    public void superBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onBackPressed() {
        baseFragment.onBack();
    }
}



