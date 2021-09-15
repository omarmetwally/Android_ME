package com.example.android.android_me.ui;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);


        Intent i=getIntent();
        Bundle c = i.getExtras();



        int head =c.getInt("headIndex");
        int body= c.getInt("bodyIndex");
        int leg=c.getInt("legsIndex");







        if(savedInstanceState==null){
        BodyPartFragment headFragment=new BodyPartFragment();

        headFragment.setmImageIds(AndroidImageAssets.getHeads());
        headFragment.setmListIndex(head);
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.head_container,headFragment).commit();











        BodyPartFragment bodyFragment=new BodyPartFragment();


        bodyFragment.setmImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setmListIndex(body);
        FragmentManager fragmentManager1=getSupportFragmentManager();
        fragmentManager1.beginTransaction()
                .add(R.id.body_container,bodyFragment).commit();


        BodyPartFragment legFragment=new BodyPartFragment();


        legFragment.setmImageIds(AndroidImageAssets.getLegs());
        legFragment.setmListIndex(leg);
        FragmentManager fragmentManager2=getSupportFragmentManager();
        fragmentManager2.beginTransaction()
                .add(R.id.legs_container,legFragment).commit();

        }}
   }

