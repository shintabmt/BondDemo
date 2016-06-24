package com.phillip.bond.bonddemo.activities;

import android.content.Intent;
import android.os.Bundle;

import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, SignInActivity.class );
        startActivity(intent);
        finish();
    }
}
