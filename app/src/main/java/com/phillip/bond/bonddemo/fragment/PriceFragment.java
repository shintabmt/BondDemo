package com.phillip.bond.bonddemo.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.adapters.MatrixTableAdapter;

public class PriceFragment extends Fragment {

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
        View contentView = inflater.inflate(R.layout.fragment_price, container, false);
        initTable(contentView);
        return contentView;
    }

    void initTable(View view) {
        TableFixHeaders tableFixHeaders = (TableFixHeaders) view.findViewById(R.id.table);
        MatrixTableAdapter<String> matrixTableAdapter = new MatrixTableAdapter<String>(this.getActivity(), new String[][]{
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
        tableFixHeaders.setAdapter(matrixTableAdapter);
    }

}
