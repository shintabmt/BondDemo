package com.phillip.bond.bonddemo.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.views.adapters.MatrixTableAdapter;
import com.phillip.bond.bonddemo.base.BaseFragment;

import butterknife.BindView;

public class PriceFragment extends BaseFragment {

    @BindView(R.id.table) TableFixHeaders mTableFixHeaders;

    private MatrixTableAdapter<String> mMatrixTableAdapter;

    public static PriceFragment newInstance() {
        PriceFragment fragment = new PriceFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_price, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initTable(view);
    }

    void initTable(View view) {
        mMatrixTableAdapter = new MatrixTableAdapter<String>(this.getActivity(), new String[][]{
                {
                        "Header 1",
                        "Header 2",
                        "Header 3",
                        "Header 4",
                        "Header 5",
                        "Header 6"},
                {
                        "Lorem",
                        "sed",
                        "do",
                        "eiusmod",
                        "tempor",
                        "incididunt"},
                {
                        "ipsum",
                        "irure",
                        "occaecat",
                        "enim",
                        "laborum",
                        "reprehenderit"},
                {
                        "dolor",
                        "fugiat",
                        "nulla",
                        "reprehenderit",
                        "laborum",
                        "consequat"},
                {
                        "sit",
                        "consequat",
                        "laborum",
                        "fugiat",
                        "eiusmod",
                        "enim"},
                {
                        "amet",
                        "nulla",
                        "Excepteur",
                        "voluptate",
                        "occaecat",
                        "et"},
                {
                        "consectetur",
                        "occaecat",
                        "fugiat",
                        "dolore",
                        "consequat",
                        "eiusmod"},
                {
                        "adipisicing",
                        "fugiat",
                        "Excepteur",
                        "occaecat",
                        "fugiat",
                        "laborum"},
                {
                        "Lorem",
                        "sed",
                        "do",
                        "eiusmod",
                        "tempor",
                        "incididunt"},
                {
                        "ipsum",
                        "irure",
                        "occaecat",
                        "enim",
                        "laborum",
                        "reprehenderit"},
                {
                        "dolor",
                        "fugiat",
                        "nulla",
                        "reprehenderit",
                        "laborum",
                        "consequat"},
                {
                        "sit",
                        "consequat",
                        "laborum",
                        "fugiat",
                        "eiusmod",
                        "enim"},
                {
                        "amet",
                        "nulla",
                        "Excepteur",
                        "voluptate",
                        "occaecat",
                        "et"},
                {
                        "consectetur",
                        "occaecat",
                        "fugiat",
                        "dolore",
                        "consequat",
                        "eiusmod"},
                {
                        "adipisicing",
                        "fugiat",
                        "Excepteur",
                        "occaecat",
                        "fugiat",
                        "laborum"},
                {
                        "Lorem",
                        "sed",
                        "do",
                        "eiusmod",
                        "tempor",
                        "incididunt"},
                {
                        "ipsum",
                        "irure",
                        "occaecat",
                        "enim",
                        "laborum",
                        "reprehenderit"},
                {
                        "dolor",
                        "fugiat",
                        "nulla",
                        "reprehenderit",
                        "laborum",
                        "consequat"},
                {
                        "sit",
                        "consequat",
                        "laborum",
                        "fugiat",
                        "eiusmod",
                        "enim"},
                {
                        "amet",
                        "nulla",
                        "Excepteur",
                        "voluptate",
                        "occaecat",
                        "et"},
                {
                        "consectetur",
                        "occaecat",
                        "fugiat",
                        "dolore",
                        "consequat",
                        "eiusmod"},
                {
                        "adipisicing",
                        "fugiat",
                        "Excepteur",
                        "occaecat",
                        "fugiat",
                        "laborum"},
                {
                        "Lorem",
                        "sed",
                        "do",
                        "eiusmod",
                        "tempor",
                        "incididunt"},
                {
                        "ipsum",
                        "irure",
                        "occaecat",
                        "enim",
                        "laborum",
                        "reprehenderit"},
                {
                        "dolor",
                        "fugiat",
                        "nulla",
                        "reprehenderit",
                        "laborum",
                        "consequat"},
                {
                        "sit",
                        "consequat",
                        "laborum",
                        "fugiat",
                        "eiusmod",
                        "enim"},
                {
                        "amet",
                        "nulla",
                        "Excepteur",
                        "voluptate",
                        "occaecat",
                        "et"},
                {
                        "consectetur",
                        "occaecat",
                        "fugiat",
                        "dolore",
                        "consequat",
                        "eiusmod"},
                {
                        "adipisicing",
                        "fugiat",
                        "Excepteur",
                        "occaecat",
                        "fugiat",
                        "laborum"}
        });
        mTableFixHeaders.setAdapter(mMatrixTableAdapter);
    }

}
