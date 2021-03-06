package com.phillip.bond.bonddemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.TransactionAnimationActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignInActivity extends TransactionAnimationActivity {

    @BindView(R.id.edt_user_id)   EditText userId;
    @BindView(R.id.edt_password)  EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mUnbinder = ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_sign_in) void signIn() {
        Intent intent = new Intent(this, HomeActivity.class );
        startActivity(intent);
    }
}
