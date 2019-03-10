package com.example.toshiba.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new FragmentSatu();
        }else if (position == 1){
            return new FragmentDua();
        }else if (position == 2){
            return new Fragment3();
        }
        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0  ){
            return "first";
        }
        else if (position  == 1){
            return  "second";
        }else if (position == 2){
            return "third";
        }

       throw new IllegalStateException("Position not valid");
    }
}
