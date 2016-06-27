package com.phillip.bond.bonddemo.fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cocosw.bottomsheet.BottomSheet;
import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.BaseFragment;
import com.phillip.bond.bonddemo.views.adapters.MatrixTableAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class PriceFragment extends BaseFragment {

    static final int FILTER_BY_ISSUER = 1;
    static final int FILTER_BY_CURRENCY = 2;
    static final int FILTER_BY_WATCH_LIST = 3;

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

    @OnClick(R.id.btn_issuer) void onClickIssuerFilter(){
        showFilterDialog(FILTER_BY_ISSUER);
    }
    @OnClick(R.id.btn_currency) void onClickCurrencyFilter(){
        showFilterDialog(FILTER_BY_CURRENCY);
    }
    @OnClick(R.id.btn_watch_list) void onClickWatchListFilter(){
        showFilterDialog(FILTER_BY_WATCH_LIST   );
    }

    void showActionMenu(){
        String[] actionMenuTitles = getActivity().getResources().getStringArray(R.array.bond_action_menu);
        TypedArray actionMenuIcons = getResources().obtainTypedArray(R.array.bond_action_menu_icon);
        getResources().obtainTypedArray(R.array.tab_bar_icon);
        BottomSheet.Builder bottomSheet = new BottomSheet.Builder(getActivity());
        for (int i = 0; i<actionMenuTitles.length; i++) {
            bottomSheet.sheet(i, actionMenuIcons.getDrawable(i), actionMenuTitles[i]);
        }
        bottomSheet.build();
        bottomSheet.show();
    }

    void showFilterDialog(int type){
        String[] filterTitles = null;
        switch (type){
            case FILTER_BY_ISSUER : filterTitles = getActivity().getResources().getStringArray(R.array.filter_by_isser_items);
                break;
            case  FILTER_BY_CURRENCY: filterTitles = getActivity().getResources().getStringArray(R.array.filter_by_currency_items);
                break;
            case FILTER_BY_WATCH_LIST: filterTitles = getActivity().getResources().getStringArray(R.array.filter_by_watch_list_items);
                break;
            default: return;
        }
        BottomSheet.Builder bottomSheet = new BottomSheet.Builder(getActivity());
        for (int i = 0; i<filterTitles.length; i++) {
            bottomSheet.sheet(i, null, filterTitles[i]);
        }
        bottomSheet.build();
        bottomSheet.show();
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
        }, new MatrixTableAdapter.onClickListener() {
            @Override
            public void onClickHeader() {

            }

            @Override
            public void onClickRow() {
                showActionMenu();
            }
        });
                mTableFixHeaders.setAdapter(mMatrixTableAdapter);
    }

}
