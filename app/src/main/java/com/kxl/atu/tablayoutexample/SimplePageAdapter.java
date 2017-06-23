package com.kxl.atu.tablayoutexample;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by atu on 2017/6/23.
 */

public class SimplePageAdapter extends FragmentPagerAdapter {

    private String[] names;
    public SimplePageAdapter(FragmentManager fm) {
        super(fm);
    }

    public SimplePageAdapter(FragmentManager supportFragmentManager, String[] title) {
        super(supportFragmentManager);
        this.names = title;
    }

    @Override
    public Fragment getItem(int position) {
        return TabPageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return names[position];
    }
}
