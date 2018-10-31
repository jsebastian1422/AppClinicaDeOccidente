package com.example.sistemas.appclinicadeoccidente;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.navigation_bottom_view);
        navigationView.setOnNavigationItemSelectedListener(this);

        if (findViewById(R.id.fragment_container) != null){

            if (savedInstanceState != null){
                return;
            }

            HomeFragment firstfragment = new HomeFragment();

            firstfragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container,firstfragment).commit();
        }
    }

    private boolean loadFragment (Fragment fragment){

        if (fragment != null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();

            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()){

            case R.id.general_action:
                fragment = new IngGeneralFragment();
                break;
            case R.id.home_action:
                fragment = new HomeFragment();
                break;
            case R.id.preferencial_action:
                fragment = new InfPreferencialFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
