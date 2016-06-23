package com.phillip.bond.bonddemo.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;
import com.phillip.bond.bonddemo.R;
import com.phillip.bond.bonddemo.base.CalligraphyActivity;
import com.phillip.bond.bonddemo.fragments.TradeBondFragment;
import com.phillip.bond.bonddemo.fragments.PriceFragment;
import com.phillip.bond.bonddemo.fragments.OderStatusFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends CalligraphyActivity {

    @BindView(R.id.tabs)    PagerSlidingTabStrip tabBar;
    @BindView(R.id.view_pager)  ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabBar.setViewPager(pager);
    }

    public class MyPagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider {

        private PriceFragment priceFragment = null;
        private OderStatusFragment oderStatusFragment = null;
        private TradeBondFragment tradeBondFragment = null;
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0 :  return "Price";
                case 1 :  return "Oder Status";
                case 2 :  return "Trade";
                default: return "";
            }
        }

        @Override
        public int getPageIconResId(int position) {
            switch (position){
                case 0 :  return R.drawable.ic_tab_price;
                case 1 :  return R.drawable.ic_tab_oder_status;
                case 2 :  return R.drawable.ic_tab_trade;
                default: return 0;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0 :  if(priceFragment == null){
                                priceFragment = PriceFragment.newInstance();
                          }
                    return priceFragment;
                case 1 :  if(oderStatusFragment == null){
                                oderStatusFragment = OderStatusFragment.newInstance();
                            }
                    return oderStatusFragment;
                case 2 :  if(tradeBondFragment == null){
                            tradeBondFragment = TradeBondFragment.newInstance();
                            }
                    return tradeBondFragment;
                default: return null;
            }
        }

    }
}
