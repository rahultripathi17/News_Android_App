package com.yournews.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int tabCount=5;
    FragmentManager fm;

    public PagerAdapter(FragmentManager fm) {
        super(fm);


    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

      switch (position){

      case 0:
          return new HomeFragment();


      case 1:
          return new SportsFragment();


      case 2:
          return new HealthFragment();


      case 3:
          return new ScienceFragment();


      case 4:
          return new EntertainmentFragment();



      default:
          return null;


      }

    }

    @Override
    public int getCount() {
        return this.tabCount;
    }
}
