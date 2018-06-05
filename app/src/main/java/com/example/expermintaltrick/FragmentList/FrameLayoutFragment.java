package com.example.expermintaltrick.FragmentList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.expermintaltrick.R;

public class FrameLayoutFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_frame_layout );

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add( R.id.frame1,new Araggijat() );
        transaction.add( R.id.frame2,new Cooking() );
        transaction.add( R.id.frame3,new DoshabMorabba() );
        transaction.add( R.id.frame4,new Golkhaneh() );
        transaction.add( R.id.frame5,new Labaniiat() );
        transaction.add( R.id.frame6,new Torshijat() );
        transaction.addToBackStack( null );
        transaction.commit();



    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount()>0){
            getSupportFragmentManager().popBackStack();
        }else {
            super.onBackPressed();
        }

    }
}
