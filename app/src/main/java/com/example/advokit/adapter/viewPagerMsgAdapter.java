package com.example.advokit.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.advokit.ui.chat;
import com.example.advokit.ui.feed;
import com.example.advokit.ui.homeFragment;

public class viewPagerMsgAdapter extends FragmentPagerAdapter {
    public viewPagerMsgAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0)
        {
            return  new homeFragment();
        }
        else if (position==1)
        {
            return  new chat();

        }
        else
        {
            return new feed();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position ==0)
        {
            return  "Home";
        }
        else if (position==1)
        {
            return  "Chat";
        }
        else
        {
            return  "Hire";
        }
    }
}