package com.example.blood_bank.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.blood_bank.R;
import com.example.blood_bank.helper.HelperMethods;
import com.example.blood_bank.view.fragment.Login_Fragment;

public class LoginCycleActivity extends Base_Activity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
            HelperMethods.setStatusBarGradiant(this);
            HelperMethods.changeLang(this,"ar");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        HelperMethods.replaceFragment(this.getSupportFragmentManager(),R.id.activity_login_container,new Login_Fragment());
        }


}

