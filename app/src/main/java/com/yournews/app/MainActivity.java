package com.yournews.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,msports,mentertainment;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    String api="d176255b5b594fdab40d3dd88e899ee1";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);



        mhome = findViewById(R.id.home);
        mscience = findViewById(R.id.Science);
        msports=findViewById(R.id.sports);
        mentertainment=findViewById(R.id.Entertainment);
        mhealth=findViewById(R.id.health);


        ViewPager viewPager = (ViewPager) findViewById(R.id.fragmentContainer);

        tabLayout = findViewById(R.id.include);



        pagerAdapter = new PagerAdapter(getSupportFragmentManager());




        viewPager.setAdapter(pagerAdapter);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4 ){
                    viewPager.setCurrentItem(tab.getPosition());
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}