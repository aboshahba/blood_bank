package com.example.blood_bank.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.blood_bank.R;
import com.example.blood_bank.R2;
import com.example.blood_bank.helper.HelperMethods;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class fragment_forget_pass extends Base_Fragment {


    @BindView(R.id.fragment_forget_pass_logo)
    ImageView fragmentForgetPassLogo;
    @BindView(R.id.fragment_forget_pass_et_phone)
    EditText fragmentForgetPassEtPhone;
    @BindView(R.id.fragment_forget_pass_btn_send)
    Button fragmentForgetPassBtnSend;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setUpActivity();
        View view = inflater.inflate(R.layout.fragment_forget_pass, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onBack() {
        super.onBack();
    }

    @OnClick(R.id.fragment_forget_pass_btn_send)
    public void onViewClicked() {
        HelperMethods.replaceFragment(getActivity().getSupportFragmentManager(),R.id.activity_login_container,new fragment_verification());

    }
}
