package com.example.blood_bank.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.blood_bank.R;
import com.example.blood_bank.helper.HelperMethods;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login_Fragment extends Base_Fragment {
    @BindView(R.id.fragment_login_logo)
    ImageView activityLoginLogo;
    @BindView(R.id.fragment_login_email_edit_text)
    EditText activityLoginEmailEditText;
    @BindView(R.id.fragment_login_password_edit_text)
    EditText activityLoginPasswordEditText;
    @BindView(R.id.fragment_login_remember_text_view)
    TextView activityLoginRememberTextView;
    @BindView(R.id.fragment_login_check_box)
    CheckBox activityLoginCheckBox;
    @BindView(R.id.fragment_login_forget_pass_text_view)
    TextView activityLoginForgetPassTextView;
    @BindView(R.id.fragment_login_btn_in)
    Button fragmentLoginBtnIn;
    @BindView(R.id.fragment_login_register_button)
    Button activityLoginRegisterButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setUpActivity();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onBack() {
getActivity().finish();
    }

    @OnClick({R.id.fragment_login_btn_in, R.id.fragment_login_register_button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fragment_login_btn_in:
                break;
            case R.id.fragment_login_register_button:
                HelperMethods.replaceFragment(getActivity().getSupportFragmentManager(), R.id.activity_login_container, new auth_fragment());
                break;
        }
    }

    @OnClick(R.id.fragment_login_forget_pass_text_view)
    public void onViewClicked() {
        HelperMethods.replaceFragment(getActivity().getSupportFragmentManager(), R.id.activity_login_container, new fragment_forget_pass());

    }
}
