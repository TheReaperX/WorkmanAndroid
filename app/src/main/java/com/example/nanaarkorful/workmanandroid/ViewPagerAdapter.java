package com.example.nanaarkorful.workmanandroid;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Nana.Arkorful on 8/31/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(android.support.v4.app.FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return MyFragment.getInstance(position);
    }

    @Override
    public int getCount() {

        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return "Tab " + position;
    }
}
