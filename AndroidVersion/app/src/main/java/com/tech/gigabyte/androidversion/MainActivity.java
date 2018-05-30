package com.tech.gigabyte.androidversion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    RecyclerView.LayoutManager mLayoutManager;
    Toolbar toolbar;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Floating Button
        floatingActionButton = (FloatingActionButton) findViewById(R.id.btnAdd);
        setContentView(R.layout.activity_main);

        //Toolbar-->menu_home
        toolbar = (Toolbar) findViewById(R.id.tb_home);
        //toolbar.setTitle("ANDROID VERSION");
        setSupportActionBar(toolbar);

        //Recycler View
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        VersionAdapter mAdapter = new VersionAdapter();
        recyclerView.setAdapter(mAdapter);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
