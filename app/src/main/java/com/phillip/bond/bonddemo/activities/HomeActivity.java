package com.phillip.bond.bonddemo.activities;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.BaseActivity;
import com.phillip.bond.bonddemo.fragments.TradeBondFragment;
import com.phillip.bond.bonddemo.fragments.PriceFragment;
import com.phillip.bond.bonddemo.fragments.OderStatusFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    final static int PRICE_FRAGMENT = 0;
    final static int ODER_STATUS_FRAGMENT = 1;
    final static int TRADE_FRAGMENT = 2;

    @BindView(R.id.tabs) TabLayout mTabBar;
    @BindView(R.id.view_pager)  ViewPager mPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mUnbinder = ButterKnife.bind(this);
        setupViewPager(mPager, getResources().getStringArray(R.array.tab_bar_title));
        mTabBar.setupWithViewPager(mPager);
        setupTabIcons(getResources().obtainTypedArray(R.array.tab_bar_icon));
    }

    private void setupViewPager(ViewPager viewPager,String[] tabTitles) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(PriceFragment.newInstance(), tabTitles[PRICE_FRAGMENT]);
        adapter.addFrag(OderStatusFragment.newInstance(), tabTitles[ODER_STATUS_FRAGMENT]);
        adapter.addFrag(TradeBondFragment.newInstance(), tabTitles[TRADE_FRAGMENT]);
        viewPager.setAdapter(adapter);
    }

    private void setupTabIcons(final TypedArray tabIcons) {
        mTabBar.getTabAt(PRICE_FRAGMENT).setIcon(tabIcons.getResourceId(PRICE_FRAGMENT, -1));
        mTabBar.getTabAt(ODER_STATUS_FRAGMENT).setIcon(tabIcons.getResourceId(ODER_STATUS_FRAGMENT, -1));
        mTabBar.getTabAt(TRADE_FRAGMENT).setIcon(tabIcons.getResourceId(TRADE_FRAGMENT, -1));
        tabIcons.recycle();
    }

    @OnClick(R.id.log_out) void logOut() {
        this.finish();
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
