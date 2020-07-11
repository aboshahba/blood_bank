package com.example.blood_bank.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.blood_bank.R;
import com.example.blood_bank.R2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class auth_fragment extends Base_Fragment {
    @BindView(R.id.fragment_aut_et_name)
    EditText fragmentAutEtName;
    @BindView(R.id.fragment_aut_et_email)
    EditText fragmentAutEtEmail;
    @BindView(R.id.fragment_aut_et_birth_day)
    EditText fragmentAutEtBirthDay;
    @BindView(R.id.fragment_aut_spinner_blood_type)
    EditText fragmentAutSpinnerBloodType;
    @BindView(R.id.fragment_aut_et_last_donation_date)
    EditText fragmentAutEtLastDonationDate;
    @BindView(R.id.fragment_aut_et_government)
    EditText fragmentAutEtGovernment;
    @BindView(R.id.fragment_aut_et_city)
    EditText fragmentAutEtCity;
    @BindView(R.id.fragment_aut_et_num)
    EditText fragmentAutEtNum;
    @BindView(R.id.fragment_aut_et_pass)
    EditText fragmentAutEtPass;
    @BindView(R.id.fragment_aut_et_confirm_pass)
    EditText fragmentAutEtConfirmPass;
    @BindView(R.id.fragment_aut_btn)
    Button fragmentAutBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setUpActivity();
        View view = inflater.inflate(R.layout.fragment_auth, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onBack() {
        super.onBack();
    }

    @OnClick(R.id.fragment_aut_btn)
    public void onViewClicked() {

    }
}
