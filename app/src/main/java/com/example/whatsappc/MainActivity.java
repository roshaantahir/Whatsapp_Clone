package com.example.whatsappc;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import com.example.whatsappc.ui.main.SectionsPagerAdapter;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.addOnPageChangeListener(onPageChangeListener);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addOnTabSelectedListener(onTabSelectedListener);
        tabs.setupWithViewPager(viewPager);
//  Notifications
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel  notificationChannel = new NotificationChannel("FirstNotification","FirstNotification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "FirstNotification")
                .setContentTitle("Notification")
                .setContentText("This is first notification")
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.icon);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(0,builder.build());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void animateFab(int position) {
        FloatingActionButton fabchat = findViewById(R.id.fabchat);
        FloatingActionButton fabstatus = findViewById(R.id.fabstatus);
        FloatingActionButton fabcall = findViewById(R.id.fabcall);
        FloatingActionButton fabedit = findViewById(R.id.fabedit);
        Animation ScaleUp = AnimationUtils.loadAnimation(this, R.anim.scaleup);

        switch (position) {
            case 0:
                fabchat.show();
                fabstatus.hide();
                fabedit.hide();
                fabcall.hide();
                break;
            case 1:
                fabchat.hide();
                fabstatus.show();
                fabedit.show();
                fabcall.hide();
                fabedit.startAnimation(ScaleUp);
                break;
            case 2:
                fabchat.hide();
                fabstatus.hide();
                fabedit.hide();
                fabcall.show();
                break;

        }
    }

    TabLayout.OnTabSelectedListener onTabSelectedListener = new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            animateFab(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    };

    ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            animateFab(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}