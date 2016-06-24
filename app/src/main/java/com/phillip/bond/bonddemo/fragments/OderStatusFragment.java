package com.phillip.bond.bonddemo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.BaseFragment;

public class OderStatusFragment extends BaseFragment {

    public static OderStatusFragment newInstance() {
        OderStatusFragment fragment = new OderStatusFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_oder_status, container, false);
    }

}
