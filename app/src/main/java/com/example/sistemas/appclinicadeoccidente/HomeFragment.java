package com.example.sistemas.appclinicadeoccidente;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class HomeFragment extends Fragment {

    CardView cdvaten_gener, cdvaten_preferen;
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);

        //return inflater.inflate(R.layout.fragment_home,null);

        //CardView Options

        cdvaten_gener = (CardView)view.findViewById(R.id.Menu_1_Id);

        cdvaten_gener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;

    }
}
