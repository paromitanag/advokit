package com.example.advokit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.advokit.adapter.viewPagerMsgAdapter;
import com.google.android.material.tabs.TabLayout;

public class Home extends AppCompatActivity {
    TabLayout tab;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

         tab = findViewById(R.id.tab);
         vp = findViewById(R.id.viewPager);

        viewPagerMsgAdapter adapter = new viewPagerMsgAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        tab.setupWithViewPager(vp);
    }
}