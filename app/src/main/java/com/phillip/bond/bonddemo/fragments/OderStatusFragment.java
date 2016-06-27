package com.phillip.bond.bonddemo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.ButterKnifeFragment;

public class OderStatusFragment extends ButterKnifeFragment {

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
