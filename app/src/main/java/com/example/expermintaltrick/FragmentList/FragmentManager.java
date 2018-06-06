package com.example.expermintaltrick.FragmentList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KARIZsystem on 05/06/2018.
 */

public class FragmentManager extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList <>(  );
    private List<String> stringList = new ArrayList <>(  );

    public FragmentManager(android.support.v4.app.FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get( position );
    }

    @Override
    public int getCount() {
        return stringList == null ? 0 : stringList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get( position );
    }

    public void addFragmentTitle( Fragment fragment , String title ){
        fragmentList.add( fragment );
        stringList.add( title );
    }
}
