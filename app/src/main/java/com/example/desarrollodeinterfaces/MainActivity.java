package com.example.desarrollodeinterfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    TabLayout my_tabLayout;
    ViewPager2 my_viewPager;
    Toolbar my_apb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_apb =  findViewById(R.id.my_toolbar);
        setSupportActionBar(my_apb);

        my_tabLayout = findViewById(R.id.my_tabs);
        my_viewPager = findViewById(R.id.my_viewpager);

        MiAdaptor adapter=new MiAdaptor(this);
        my_viewPager.setAdapter(adapter);
        new TabLayoutMediator(my_tabLayout, my_viewPager,
                (tab, position) -> tab.setText(adapter.getTabTitle(position))
        ).attach();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;}
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_opciones) {
            this.finish();}
        return super.onOptionsItemSelected(item);
    }
}