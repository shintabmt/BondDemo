package com.phillip.bond.bonddemo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.ButterKnifeFragment;

public class TradeBondFragment extends ButterKnifeFragment {

    public static TradeBondFragment newInstance() {
        TradeBondFragment fragment = new TradeBondFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_trade_bond, container, false);
    }

}
